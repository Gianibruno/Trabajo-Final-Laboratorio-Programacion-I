/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * Clase Data: Lector
 * 
 */
public class LectorData {
    //Constantes
    final private String TABLA = "lectores",
            CAMPOS[] = {"id_lector", "dni", "nombre", "telefono", "domicilio", "fechaNacimiento", "estado"};
    //Atributos
    private java.sql.PreparedStatement ps = null;
    private java.sql.ResultSet rs = null;
    private java.sql.Connection con = null;
    private Object ex = null;

    public LectorData(Conexion con) {
        this.con = con.getConexion();
    }
    
    public Object getExcepcion(){
        return ex;
    }
    
    public int guardar(Entidades.Lector entidad) {
        int idnuevo = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + ", "
                + CAMPOS[4] + ", "
                + CAMPOS[5] + ", "
                + CAMPOS[6] + ") VALUES (?,?,?,?,?,1);";
        if(entidad != null){
            try {
                ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, entidad.getDni() + "");
                ps.setString(2, entidad.getNombre());
                ps.setString(3, entidad.getTelefono());
                ps.setString(4, entidad.getDireccion());
                ps.setDate(5, java.sql.Date.valueOf(entidad.getFechaNacimiento()));
                ps.executeUpdate();
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idnuevo = rs.getInt(1);
                }
                ps.close();
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return idnuevo;
    }
    
    public int modificar(Entidades.Lector entidad) {
        int respuesta = 0;
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[1] + "=?, "
                + CAMPOS[2] + "=?, "
                + CAMPOS[3] + "=?, "
                + CAMPOS[4] + "=?, "
                + CAMPOS[5] + "=? "
                + "WHERE " + CAMPOS[0] + "=?;";
        if(entidad != null && entidad.getIdLector() > 0){
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, entidad.getDni());
                ps.setString(2, entidad.getNombre());
                ps.setString(3, entidad.getTelefono());
                ps.setString(4, entidad.getDireccion());
                ps.setDate(5, java.sql.Date.valueOf(entidad.getFechaNacimiento()));
                ps.setInt(6, entidad.getIdLector());
                ps.executeUpdate();
                ps.close();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }
    
    public int desactivar(int idAutor){
        int respuesta = 0;
        
        return respuesta;
    }
    
    public int activar(int idAutor){
        int respuesta = 0;
        
        return respuesta;
    }
    
    public java.util.List<Entidades.Lector> obtenerLectores() {
        Entidades.Lector entidad;
        java.util.ArrayList<Entidades.Lector> lectores = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + TABLA + ";";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                entidad = new Entidades.Lector(
                        rs.getString(CAMPOS[2]), 
                        rs.getString(CAMPOS[3]), 
                        rs.getString(CAMPOS[4]), 
                        rs.getString(CAMPOS[5]), 
                        java.time.LocalDate.parse(rs.getString(CAMPOS[6])));
                entidad.setIdLector(rs.getInt(CAMPOS[0]));
                entidad.setEstado(rs.getInt(CAMPOS[7]));
                lectores.add(entidad);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return lectores;
    }
    
    public Entidades.Lector buscarLector(String dni) {
        Entidades.Lector entidad = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[1] + "=?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                entidad = new Entidades.Lector();
                entidad.setIdLector(rs.getInt(CAMPOS[0]));
                entidad.setDni(rs.getString(CAMPOS[1]));
                entidad.setNombre(rs.getString(CAMPOS[2]));
                entidad.setTelefono(rs.getString(CAMPOS[3]));
                entidad.setDireccion(rs.getString(CAMPOS[4]));
                entidad.setFechaNacimiento(java.time.LocalDate.parse(rs.getString(CAMPOS[5])));
                entidad.setEstado(rs.getInt(CAMPOS[6]));
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return entidad;
    }
    
    private void error(Object ex) {
        System.out.println("Error: "+ ex);
        this.ex = ex;
    }
}
