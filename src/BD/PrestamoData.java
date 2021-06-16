/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

import Entidades.Biblioteca;

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
 * <h2>CONSTRUCTORES:</h2>
 * <ol>
 * <li>PrestamoData(Conexion)</li>
 * </ol>
 * <h2>LOS METODOS:</h2>
 * <ol>
 * <li>registrar(Prestamo) : idPrestamo.</li>
 * <li>registrar(idEjemplar, idLector) : idPrestamo.</li>
 * <li>modificar(Prestamo) : 1 o 0.</li>
 * <li>modificar(idPrestamo, idEjemplar, idLector) : 1 o 0.</li>
 * <li>anular(Prestamo) : 1 o 0.</li>
 * <li>anular(idPrestamo) : 1 o 0.</li>
 * <li>devolver(Prestamo, idPrestamo) : 1 o 0</li>
 * <li>listar(fecha) : Lista de Prestamos en esa fecha.</li>
 * <li>listar(lector) : Lista de Prestamos del lector.</li>
 * <li>listarVencidos() : Lista de Lectores con prestamos vencidos.</li>
 * <li>getExcepcion() : Objeto con la ultima excepcion, o null.</li>
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
    private BD.Conexion conexion = null;
    private Object ex = null;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructores ">
    /**
     * Construir un objeto PrestamoData
     * @param conexion 
     */
    public PrestamoData(BD.Conexion conexion) {
        this.conexion = conexion;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Getters ">
    public Object getExcepcion() {
        return ex;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Funcionalidades ">
    /**
     * Inserta un Prestamo (INSERT INTO) completo incluyendo fechas de prestamo 
     * y devolucion, devuelve el id nuevo.
     * @param prestamo != null
     * @return idPrestamo o 0 si error.
     */
    public int registrar(Entidades.Prestamo prestamo) {
        int respuesta = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + ", "
                + CAMPOS[4] + "" 
                + ") "
                + "VALUES ("
                + "?, " //idEjemplar
                + "?, " //idLector
                + "?, "  //fechaPrestamo
                + "?"   //fechaDevolucion
                + ");"
                ;
        if(prestamo != null){
            try {
                declaracion = conexion.getConexion().prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                declaracion.setInt(1, prestamo.getEjemplar().getId());
                declaracion.setInt(2, prestamo.getLector().getIdLector());
                declaracion.setDate(3, java.sql.Date.valueOf(prestamo.getFechaPrestamo()));
                if(prestamo.getFechaDevolucion() != null)
                    declaracion.setDate(4, java.sql.Date.valueOf(prestamo.getFechaDevolucion()));
                else
                    declaracion.setNull(4, java.sql.Types.DATE);
                declaracion.executeUpdate();
                resultado = declaracion.getGeneratedKeys();
                if(resultado.next()){
                    respuesta = resultado.getInt(CAMPOS[0]);
                }
                declaracion.close();
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Inserta un Prestamo (INSERT INTO) por Ids de Ejemplar y Lector, 
     * devuelve el id nuevo.
     * @param idEjemplar
     * @param idLector
     * @return idPrestamo o 0 si error.
     */
    public int registrar(int idEjemplar, int idLector) {
        int respuesta = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + " "
            //    + CAMPOS[4] + "" //ver el tema de devolucion para null
                + ") "
                + "VALUES ("
                + "?, " //idEjemplar
                + "?, " //idLector
                + "? " //now()
            //    + "?" //null
                + ");"
                ;
        try {
            declaracion = conexion.getConexion().prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
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
     * @return 1 si logro modificar los datos.
     */
    public int modificar(Entidades.Prestamo prestamo){
        String sql = "UPDATE "+ TABLA +" SET "
                + CAMPOS[1] + "=?, " //idEjemplar
                + CAMPOS[2] + "=? "  //idLector
                + "WHERE " + CAMPOS[0] + "=?;"; //idPrestamo
        int 
            idEjemplar = 0, 
            idLector = 0, 
            idPrestamo = 0,
            respuesta = 0;
        if(prestamo != null){
            idEjemplar = prestamo.getEjemplar().getId();
            idLector = prestamo.getLector().getIdLector();
            idPrestamo = prestamo.getIdPrestamo();
        }
        if(idPrestamo > 0){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setInt(1, idEjemplar);
                declaracion.setInt(2, idLector);
                declaracion.setInt(3, idPrestamo);
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            }catch(java.sql.SQLException ex){
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Modificar un Prestamo (UPDATE) por sus ids.
     * @param idPrestamo Entero > 0.
     * @param idLector Entero > 0.
     * @param idEjemplar Entero > 0.
     * @return 1 si logro modificar los datos.
     */
    public int modificar(int idPrestamo, int idLector, int idEjemplar){
        String sql = "UPDATE "+ TABLA +" SET "
                + CAMPOS[1] + "=?, " //idEjemplar
                + CAMPOS[2] + "=? "  //idLector
                + "WHERE " + CAMPOS[0] + "=?;"; //idPrestamo
        int 
            respuesta = 0;
        if(idPrestamo > 0 && idLector > 0 && idEjemplar > 0){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setInt(1, idEjemplar);
                declaracion.setInt(2, idLector);
                declaracion.setInt(3, idPrestamo);
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            }catch(java.sql.SQLException ex){
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Anular un Prestamo (DELETE FROM)
     * @param prestamo
     * @return 1 si logro eliminarlo.
     */
    public int anular(Entidades.Prestamo prestamo){
        //delete prestamo? que pasa si hay multa?
        String sql = "DELETE FROM "+ TABLA 
                +" WHERE "+ CAMPOS[0] +"=?;";
        int 
            idPrestamo = (prestamo != null) ? prestamo.getIdPrestamo() : 0,
            respuesta = 0;
        if(idPrestamo > 0){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setInt(1, idPrestamo);
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            }catch(java.sql.SQLException ex){
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Anular un Prestamo (DELETE FROM) por su id
     * @param id entero > 0.
     * @return 1 si logro eliminarlo.
     */
    public int anular(int id){
        //delete prestamo? que pasa si hay multa?
        String sql = "DELETE FROM "+ TABLA 
                +" WHERE "+ CAMPOS[0] +"=?;";
        int 
            idPrestamo = id,
            respuesta = 0;
        if(idPrestamo > 0){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setInt(1, idPrestamo);
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            }catch(java.sql.SQLException ex){
                error(ex);
            }
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
        Entidades.Lector lector;
        Entidades.Ejemplar ejemplar;
        BD.EjemplarData eData = new BD.EjemplarData(conexion);
        BD.LectorData lData = new BD.LectorData(conexion);
        int 
                idPrestamo = 0,
                idEjemplar = 0,
                idLector = 0;
        java.time.LocalDate fechaDevolucion = null;
        if(fechaPrestamo != null){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setDate(1, java.sql.Date.valueOf(fechaPrestamo));
                resultado = declaracion.executeQuery();
                while(resultado.next()){
                    idPrestamo = resultado.getInt(CAMPOS[0]);
                    idEjemplar = resultado.getInt(CAMPOS[1]);
                    idLector = resultado.getInt(CAMPOS[2]);
                    fechaDevolucion = (resultado.getDate(CAMPOS[4]) == null) ? null : resultado.getDate(CAMPOS[4]).toLocalDate();
                    //El ejemplar
                    ejemplar = eData.buscarEjemplar(idEjemplar);
                    //El lector
                    lector = lData.buscarLector(idLector);//Modificar por el metodo de busqueda por id
                    //El prestamo
                    prestamo = new Entidades.Prestamo(
                        idPrestamo,
                        ejemplar,
                        lector,
                        fechaPrestamo,
                        fechaDevolucion
                    );
                    respuesta.add(prestamo);
                }
                declaracion.close();
            }catch(java.sql.SQLException ex){
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Listar los prestamos por lector
     * @param lector
     * @return lista de prestamos
     */
    public java.util.List<Entidades.Prestamo> listar(Entidades.Lector lector){
        java.util.List<Entidades.Prestamo> respuesta = new java.util.ArrayList<>();
        String sql = "SELECT * FROM "+ TABLA +" "
                + "WHERE "+ CAMPOS[2] +"=?";
        Entidades.Prestamo prestamo;
        Entidades.Ejemplar ejemplar;
        BD.EjemplarData eData = new BD.EjemplarData(conexion);
        BD.LectorData lData = new BD.LectorData(conexion);
        int 
                idPrestamo = 0,
                idEjemplar = 0,
                idLector = 0;
        java.time.LocalDate 
                fechaPrestamo = null,
                fechaDevolucion = null;
        if(lector != null) idLector = lector.getIdLector();
        if(idLector > 0){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setInt(1, idLector);
                resultado = declaracion.executeQuery();
                while(resultado.next()){
                    idPrestamo = resultado.getInt(CAMPOS[0]);
                    idEjemplar = resultado.getInt(CAMPOS[1]);
                    fechaPrestamo = (resultado.getDate(CAMPOS[3]) == null) ? null : resultado.getDate(CAMPOS[3]).toLocalDate();
                    fechaDevolucion = (resultado.getDate(CAMPOS[4]) == null) ? null : resultado.getDate(CAMPOS[4]).toLocalDate();
                    //El ejemplar
                    ejemplar = eData.buscarEjemplar(idEjemplar);
                    //El lector
                    lector = lData.buscarLector(idLector);//Modificar por el metodo de busqueda por id
                    //El prestamo
                    prestamo = new Entidades.Prestamo(
                        idPrestamo,
                        ejemplar,
                        lector,
                        fechaPrestamo,
                        fechaDevolucion
                    );
                    respuesta.add(prestamo);
                }
                declaracion.close();
            }catch(java.sql.SQLException ex){
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Listar los prestamos por el id de un lector
     * @param idLector entero > 0.
     * @return lista de prestamos
     */
    public java.util.List<Entidades.Prestamo> listar(int idLector){
        java.util.List<Entidades.Prestamo> respuesta = new java.util.ArrayList<>();
        String sql = "SELECT * FROM "+ TABLA +" "
                + "WHERE "+ CAMPOS[2] +"=?";
        Entidades.Prestamo prestamo;
        Entidades.Lector lector;
        Entidades.Ejemplar ejemplar;
        BD.EjemplarData eData = new BD.EjemplarData(conexion);
        BD.LectorData lData = new BD.LectorData(conexion);
        int 
                idPrestamo = 0,
                idEjemplar = 0;
        java.time.LocalDate 
                fechaPrestamo = null,
                fechaDevolucion = null;
        if(idLector > 0){
            try{
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setInt(1, idLector);
                resultado = declaracion.executeQuery();
                while(resultado.next()){
                    idPrestamo = resultado.getInt(CAMPOS[0]);
                    idEjemplar = resultado.getInt(CAMPOS[1]);
                    fechaPrestamo = (resultado.getDate(CAMPOS[3]) == null) ? null : resultado.getDate(CAMPOS[3]).toLocalDate();
                    fechaDevolucion = (resultado.getDate(CAMPOS[4]) == null) ? null : resultado.getDate(CAMPOS[4]).toLocalDate();
                    //El ejemplar
                    ejemplar = eData.buscarEjemplar(idEjemplar);
                    //El lector
                    lector = lData.buscarLector(idLector);//Modificar por el metodo de busqueda por id
                    //El prestamo
                    prestamo = new Entidades.Prestamo(
                        idPrestamo,
                        ejemplar,
                        lector,
                        fechaPrestamo,
                        fechaDevolucion
                    );
                    respuesta.add(prestamo);
                }
                declaracion.close();
            }catch(java.sql.SQLException ex){
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Listar todos los lectores que poseen prestamos vencidos
     * @return lista de lectores.
     */
    public java.util.List<Entidades.Lector> listarVencidos(){
        java.util.List<Entidades.Lector> respuesta = new java.util.ArrayList<>();
        String 
            tablaLectores = "lectores", campoId = CAMPOS[2],
            sql = "SELECT DISTINCT l.* FROM "+ tablaLectores +" AS l, "+ TABLA +" AS p "
                + "WHERE p." + campoId + " = l." + campoId +" "
                + "AND DATEDIFF(NOW(), p."+ CAMPOS[3] +") > "+ Biblioteca.CONF.MAXDIASPRESTADOS;
        Entidades.Lector lector;
        try{
            declaracion = conexion.getConexion().prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while(resultado.next()){
                lector = new Entidades.Lector(
                    resultado.getString(2), //dni
                    resultado.getString(3), //nombre
                    resultado.getString(4), //telefono
                    resultado.getString(5), //direccion
                    resultado.getDate(6).toLocalDate() //fechaNacimiento
                );
                lector.setIdLector(resultado.getInt(1));
                lector.setEstado(resultado.getInt(7));
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
     * Modifica la fecha de devolucion del Prestamo. (UPDATE)
     * @param prestamo que contiene id y la fecha a modificar.
     * @return 1 si logro modificar la fecha de devolucion.
     */
    public int devolver(Entidades.Prestamo prestamo){
        int 
            respuesta = 0, 
            idPrestamo = 0;
        java.time.LocalDate fechaDevolucion = null;
        String sql = "UPDATE "+ TABLA +" SET "
                + CAMPOS[4] + "=? " //fechaDevolucion del prestamo
                + "WHERE " + CAMPOS[0] + "=?;"; //idPrestamo
        if(prestamo != null){
            idPrestamo = prestamo.getIdPrestamo();
            fechaDevolucion = prestamo.getFechaDevolucion();
        }
        if(idPrestamo > 0 && fechaDevolucion != null){
            try {
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setDate(1,java.sql.Date.valueOf(fechaDevolucion));
                declaracion.setInt(2, idPrestamo);
                declaracion.executeUpdate();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }
    /**
     * Modifica la fecha de devolucion del Prestamo (UPDATE) por id.
     * fecha_devolucion = java.time.LocalDate.now();
     * @param idPrestamo Entero > 0.
     * @return 1 si logro modificar la fecha de devolucion.
     */
    public int devolver(int idPrestamo){
        int respuesta = 0;
        java.time.LocalDate fechaDevolucion = java.time.LocalDate.now();
        String sql = "UPDATE "+ TABLA +" SET "
                + CAMPOS[4] + "=? " //fechaDevolucion del prestamo
                + "WHERE " + CAMPOS[0] + "=?;"; //idPrestamo
        if(idPrestamo > 0){
            try {
                declaracion = conexion.getConexion().prepareStatement(sql);
                declaracion.setDate(1, java.sql.Date.valueOf(fechaDevolucion));
                declaracion.setInt(2, idPrestamo);
                declaracion.executeUpdate();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }
    
    public java.util.List<Entidades.Prestamo> buscar(String nombreLibro){
        java.util.ArrayList<Entidades.Prestamo> respuesta = new java.util.ArrayList<Entidades.Prestamo>();
        Entidades.Prestamo prestamo;
        Entidades.Lector lector;
        Entidades.Ejemplar ejemplar;
        String sql = "SELECT p.* FROM prestamos AS p, ejemplares AS e, libros AS l "
                + "WHERE l.nombre like \"%"+ nombreLibro +"%\" "
                + "AND p.id_ejemplar = e.id_ejemplar "
                + "AND e.id_libro = l.id_libro;";
        BD.EjemplarData eData = new BD.EjemplarData(conexion);
        BD.LectorData lData = new BD.LectorData(conexion);
        int 
                idPrestamo = 0,
                idLector = 0,
                idEjemplar = 0;
        java.time.LocalDate 
                fechaPrestamo = null,
                fechaDevolucion = null;
        try{
            declaracion = conexion.getConexion().prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while(resultado.next()){
                idPrestamo = resultado.getInt(CAMPOS[0]);
                idEjemplar = resultado.getInt(CAMPOS[1]);
                idLector = resultado.getInt(CAMPOS[2]);
                fechaPrestamo = (resultado.getDate(CAMPOS[3]) == null) ? null : resultado.getDate(CAMPOS[3]).toLocalDate();
                fechaDevolucion = (resultado.getDate(CAMPOS[4]) == null) ? null : resultado.getDate(CAMPOS[4]).toLocalDate();
                //El ejemplar
                ejemplar = eData.buscarEjemplar(idEjemplar);
                //El lector
                lector = lData.buscarLector(idLector);//Modificar por el metodo de busqueda por id
                //El prestamo
                prestamo = new Entidades.Prestamo(
                    idPrestamo,
                    ejemplar,
                    lector,
                    fechaPrestamo,
                    fechaDevolucion
                );
                respuesta.add(prestamo);
            }
            declaracion.close();
        }catch(java.sql.SQLException ex){
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
        this.ex = ex;
    }
    //</editor-fold>
}
