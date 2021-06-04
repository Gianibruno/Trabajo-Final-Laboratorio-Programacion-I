/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * <h1>Clase Data: Prestamo</h1>
 * <h3>De las funcionalidades:</h3>
 * <ul>
 * <li>Registrar Modificar o Anular un Prestamo.</li>
 * <li>Listado de Prestamos por fecha.</li>
 * <li>Listado de Prestamos vigentes por lector.</li>
 * <li>Listado de Lectores con prestamos vencidos.</li>
 * </ul>
 * <h3>A considerar</h3>
 * <p>Un ejemplar puede ser prestado a varios Lectores en distintas fechas</p>
 * <h2>LOS METODOS:</h2>
 * <ol>
 * <li>registrar(idEjemplar, idLector) : int con idPrestamo.</li>
 * <li>modificar(Prestamo, idPrestamo) : 1 o 0.</li>
 * <li>anular(Prestamo, idPrestamo) : 1 o 0.</li>
 * <li>devolver(Prestamo, idPrestamo) : 1 o 0</li>
 * <li>listar(fecha) : Lista de Prestamos en esa fecha.</li>
 * <li>listar(lector) : Lista de Prestamos del lector.</li>
 * <li>listarVencidos() : Lista de Lectores con prestamos vencidos.</li>
 * </ol>
 */
public class PrestamoData {
    
    //<editor-fold defaultstate="collapsed" desc=" Constantes ">
    private final String 
            TABLA = "prestamos",
            CAMPOS[] = {
                "id_prestamo",      //0
                "id_ejemplar",      //1
                "id_lector",        //2
                "fecha_prestamo",   //3
                "fecha_devolucion"  //4
            };
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Atributos ">
    private java.sql.PreparedStatement declaracion = null;
    private java.sql.ResultSet resultado = null;
    private java.sql.Connection conexion = null;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructores ">
    /**
     * Construir un objeto PrestamoData
     * @param conexion 
     */
    public PrestamoData(BD.Conexion conexion) {
        this.conexion = conexion.getConexion();
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Funcionalidades ">
    /**
     * Inserta un Prestamo (INSERT INTO), devuelve el id nuevo.
     * @param idEjemplar
     * @param idLector
     * @return idPrestamo
     */
    public int registrar(int idEjemplar, int idLector) {
        int respuesta = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + ", "
            //    + CAMPOS[4] + "" //ver el tema de devolucion para null
                + ") "
                + "VALUES ("
                + "?, " //idEjemplar
                + "?, " //idLector
                + "?, " //now()
            //    + "?" //null
                + ");"
                ;
        try {
            declaracion = conexion.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            declaracion.setInt(1, idEjemplar);
            declaracion.setInt(2, idLector);
            declaracion.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
            //declaracion.setNull(4, 0); //quiero pasar null
            declaracion.executeUpdate();
            resultado = declaracion.getGeneratedKeys();
            if(resultado.next()){
                respuesta = resultado.getInt(CAMPOS[0]);
            }
            declaracion.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return respuesta;
    }
    /**
     * Modificar un Prestamo (UPDATE)
     * @param prestamo
     * @param id opcional, si id > 0 usa este id en lugar del id del prestamo.
     * @return 1 si logro modificar los datos.
     */
    public int modificar(Entidades.Prestamo prestamo, int id){
        String sql = "UPDATE "+ TABLA +" SET "
                + CAMPOS[1] + "=?, " //idEjemplar
                + CAMPOS[2] + "=? "  //idLector
                + "WHERE " + CAMPOS[0] + "=?;"; //idPrestamo
        int 
            idEjemplar = prestamo.getIdEjemplar(), 
            idLector = prestamo.getIdLector(), 
            idPrestamo = (id == 0) ? prestamo.getIdPrestamo() : id,
            respuesta = 0;
        try{
            declaracion = conexion.prepareStatement(sql);
            declaracion.setInt(1, idEjemplar);
            declaracion.setInt(2, idLector);
            declaracion.setInt(3, idPrestamo);
            declaracion.executeUpdate();
            declaracion.close();
            respuesta = 1;
        }catch(java.sql.SQLException ex){
            error(ex);
        }
        return respuesta;
    }
    /**
     * Anular un Prestamo (DELETE FROM)
     * @param prestamo
     * @param id opcional, si id > 0 usa este id en lugar del id del prestamo.
     * @return 1 si logro eliminarlo.
     */
    public int anular(Entidades.Prestamo prestamo, int id){
        //delete prestamo? que pasa si hay multa?
        String sql = "DELETE FROM"+ TABLA 
                +" WHERE "+ CAMPOS[0] +"=?;";
        int 
            idPrestamo = (id == 0) ? prestamo.getIdPrestamo() : id,
            respuesta = 0;
        try{
            declaracion = conexion.prepareStatement(sql);
            declaracion.setInt(1, idPrestamo);
            declaracion.executeUpdate();
            declaracion.close();
            respuesta = 1;
        }catch(java.sql.SQLException ex){
            error(ex);
        }
        return respuesta;
    }
    /**
     * Listar los prestamos por fecha de prestamo
     * @param fechaPrestamo
     * @return Lista de prestamos
     */
    public java.util.List<Entidades.Prestamo> listar(java.time.LocalDate fechaPrestamo){
        java.util.List<Entidades.Prestamo> respuesta = new java.util.ArrayList<>();
        String sql = "SELECT * FROM "+ TABLA +" "
                + "WHERE "+ CAMPOS[3] +"=?";
        Entidades.Prestamo prestamo;
        try{
            declaracion = conexion.prepareStatement(sql);
            declaracion.setDate(1, java.sql.Date.valueOf(fechaPrestamo));
            resultado = declaracion.executeQuery();
            while(resultado.next()){
                prestamo = new Entidades.Prestamo();
                prestamo.setIdPrestamo(resultado.getInt(CAMPOS[0])); //idPrestamo
                prestamo.setIdEjemplar(resultado.getInt(CAMPOS[1])); //idEjemplar
                prestamo.setIdLector(resultado.getInt(CAMPOS[2]));   //idLector
                prestamo.setFechaPrestamo(resultado.getDate(CAMPOS[3]).toLocalDate()); //fecha_prestamo
                //ver si es null
                prestamo.setFechaDevolucion(resultado.getDate(CAMPOS[4]).toLocalDate()); //fecha_devolucion
                respuesta.add(prestamo);
            }
            declaracion.close();
        }catch(java.sql.SQLException ex){
            error(ex);
        }
        return respuesta;
    }
    /**
     * Listar los prestamos por lector
     * @param lector
     * @param id opcional si id>0, busca por id en lugar del lector
     * @return lista de prestamos
     */
    public java.util.List<Entidades.Prestamo> listar(Entidades.Lector lector, int id){
        java.util.List<Entidades.Prestamo> respuesta = new java.util.ArrayList<>();
        String sql = "SELECT * FROM "+ TABLA +" "
                + "WHERE "+ CAMPOS[2] +"=?";
        int idLector = (id == 0) ? lector.getIdLector() : id;
        Entidades.Prestamo prestamo;
        try{
            declaracion = conexion.prepareStatement(sql);
            declaracion.setInt(1, idLector);
            resultado = declaracion.executeQuery();
            while(resultado.next()){
                prestamo = new Entidades.Prestamo();
                prestamo.setIdPrestamo(resultado.getInt(CAMPOS[0])); //idPrestamo
                prestamo.setIdEjemplar(resultado.getInt(CAMPOS[1])); //idEjemplar
                prestamo.setIdLector(resultado.getInt(CAMPOS[2]));   //idLector
                prestamo.setFechaPrestamo(resultado.getDate(CAMPOS[3]).toLocalDate()); //fecha_prestamo
                //ver si es null
                prestamo.setFechaDevolucion(resultado.getDate(CAMPOS[4]).toLocalDate()); //fecha_devolucion
                respuesta.add(prestamo);
            }
            declaracion.close();
        }catch(java.sql.SQLException ex){
            error(ex);
        }
        return respuesta;
    }
    /**
     * Listar todos los lectores que poseen prestamos vencidos
     * @return lista de lectores.
     */
    public java.util.List<Entidades.Lector> listarVencidos(){
        java.util.List<Entidades.Lector> respuesta = new java.util.ArrayList<>();
        //select * from lectores where ... (
        //select idLector from prestamos where fecha de prestamo supera 
        //en 3 dias la fecha actual)
        String 
            lectores = "lectores",
            sql = "SELECT * FROM "+ TABLA +" ";//MODIFICAR
        Entidades.Lector lector;
        try{
            declaracion = conexion.prepareStatement(sql);
            //parametros int, date
            resultado = declaracion.executeQuery();
            while(resultado.next()){
                lector = new Entidades.Lector(
                    resultado.getLong(2), //dni
                    resultado.getString(3), //nombre
                    resultado.getString(4), //nacionalidad
                    resultado.getDate(4).toLocalDate() //fechaNacimiento
                );
                lector.setIdLector(resultado.getInt(1));
                respuesta.add(lector);
            }
            declaracion.close();
        }catch(java.sql.SQLException ex){
            error(ex);
        }
        return respuesta;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Necesarios ">
    /**
     * Modifica la fecha de devolucion del Prestamo (UPDATE)
     * @param prestamo
     * @param id opcional si id>0, no usa el id del Prestamo
     * @return 1 si logro modificar la fecha de devolucion
     */
    public int devolver(Entidades.Prestamo prestamo, int id){
        int 
            respuesta = 0, 
            idPrestamo = (id == 0) ? prestamo.getIdPrestamo() : id;
        String sql = "UPDATE "+ TABLA +" SET "
                + CAMPOS[4] + "=? " //fecha
                + "WHERE " + CAMPOS[0] + "=?;"; //idPrestamo
        try {
            declaracion = conexion.prepareStatement(sql);
            declaracion.setDate(1,java.sql.Date.valueOf(java.time.LocalDate.now()));
            declaracion.setInt(2, idPrestamo);
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return respuesta;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Privados ">
    /**
     * Metodo privado para ver que hacer con los mensajes de error desde la clase data
     * @param ex 
     */
    private void error(Object ex){
        //Ver que hacer con errores
        System.out.println("Error: \n"+ex);
    }
    //</editor-fold>
}
