/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * Clase Data: Autor
 *
 */
public class AutorData {

    //Constantes
    final private String TABLA = "autores",
            CAMPOS[] = {"id_autor", "dni", "nombre", "nacionalidad", "fechaNacimiento", "estado"};
    //Atributos
    private java.sql.PreparedStatement ps = null;
    private java.sql.ResultSet rs = null;
    private java.sql.Connection con = null;
    private Object ex = null;

    public AutorData(Conexion con) {
        this.con = con.getConexion();
    }
    
    public Object getExcepcion(){
        return ex;
    }
    
    public int guardar(Entidades.Autor autor) {
        int idnuevo = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + ", "
                + CAMPOS[4] + ", "
                + CAMPOS[5] + ") VALUES (?,?,?,?,1);";
        if(autor != null){
            try {
                ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, autor.getDni() + "");
                ps.setString(2, autor.getNombre());
                ps.setString(3, autor.getNacionalidad());
                ps.setDate(4, java.sql.Date.valueOf(autor.getFechaNacimiento()));
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

    public int modificar(Entidades.Autor autor) {
        int respuesta = 0;
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[1] + "=?, "
                + CAMPOS[2] + "=?, "
                + CAMPOS[3] + "=?, "
                + CAMPOS[4] + "=? "
                + "WHERE " + CAMPOS[0] + "=?;";
        if(autor != null && autor.getIdAutor() > 0){
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, autor.getDni());
                ps.setString(2, autor.getNombre());
                ps.setString(3, autor.getNacionalidad());
                ps.setDate(4, java.sql.Date.valueOf(autor.getFechaNacimiento()));
                ps.setInt(5, autor.getIdAutor());
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
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[5] + "=? "
                + "WHERE " + CAMPOS[0] + "=?;";
        if(idAutor > 0){
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, 0);
                ps.setInt(2, idAutor);
                ps.executeUpdate();
                ps.close();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }
    
    public int activar(int idAutor){
        int respuesta = 0;
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[5] + "=? "
                + "WHERE " + CAMPOS[0] + "=?;";
        if(idAutor > 0){
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, 1);
                ps.setInt(2, idAutor);
                ps.executeUpdate();
                ps.close();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }
    public java.util.List<Entidades.Autor> obtenerAutores() {
        Entidades.Autor autor;
        java.util.ArrayList<Entidades.Autor> autores = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + TABLA + ";";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                autor = new Entidades.Autor();
                autor.setIdAutor(rs.getInt(CAMPOS[0]));
                autor.setDni(rs.getString(CAMPOS[1]));
                autor.setNombre(rs.getString(CAMPOS[2]));
                autor.setNacionalidad(rs.getString(CAMPOS[3]));
                autor.setFechaNacimiento(java.time.LocalDate.parse(rs.getString(CAMPOS[4])));
                autor.setEstado(rs.getInt(CAMPOS[5]));
                autores.add(autor);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return autores;
    }

    public Entidades.Autor buscarAutor(String dni) {
        Entidades.Autor autor = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[1] + "=?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                autor = new Entidades.Autor();
                autor.setIdAutor(rs.getInt(CAMPOS[0]));
                autor.setDni(rs.getString(CAMPOS[1]));
                autor.setNombre(rs.getString(CAMPOS[2]));
                autor.setNacionalidad(rs.getString(CAMPOS[3]));
                autor.setFechaNacimiento(java.time.LocalDate.parse(rs.getString(CAMPOS[4])));
                autor.setEstado(rs.getInt(CAMPOS[5]));
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return autor;
    }

    private void error(Object ex) {
        System.out.println("Error: "+ ex);
        this.ex = ex;
    }
}