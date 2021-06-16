/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * Clase Data: Ejemplar
 *
 */
public class EjemplarData {

    final private String TABLA = "ejemplares", //¿Por qué nos hemos olvidado de poner letras mayúsculas en los nombres?
            CAMPOS[] = {"id_ejemplar", "id_libro", "estado"};
    //Atributos
    private java.sql.PreparedStatement ps = null;
    private java.sql.ResultSet rs = null;
    private java.sql.Connection con = null;
    private Object ex = null;
    private Conexion conaux = null;

    public EjemplarData(Conexion con) {
        this.con = con.getConexion();
        this.conaux = con;
    }

    public Object getExcepcion() {
        return ex;
    }

    public int guardar(Entidades.Ejemplar ejemplar) { //Interesante alternativa a void.
        int idnuevo = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[0] + ", "
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ",  VALUES (?,?,?);";
        if (ejemplar != null) {
            try {
                ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, ejemplar.getId());
                ps.setInt(2, ejemplar.getLibro().getId());
                ps.setInt(3, ejemplar.getEstado());
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

    public int modificar(Entidades.Ejemplar ejemplar) {
        int respuesta = 0;
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[1] + "=?, "
                + CAMPOS[2] + "=?, "
                + CAMPOS[3] + "=?, "
                + "WHERE " + CAMPOS[0] + "=?;";
        if (ejemplar != null && ejemplar.getId() > 0) {
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, ejemplar.getId());
                ps.setInt(2, ejemplar.getLibro().getId());
                ps.setInt(3, ejemplar.getEstado());
                ps.executeUpdate();
                ps.close();
                respuesta = 0; //Si retorna 0, entonces todo 0K.
            } catch (java.sql.SQLException ex) {
                error(ex);
                respuesta = 1;
            }
        }
        return respuesta;
    }

    public Entidades.Ejemplar buscarEjemplar(int id) {
        Entidades.Ejemplar ejemplar = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[0] + "=?;";
        LibroData ld = new LibroData(conaux);
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ejemplar = new Entidades.Ejemplar();
                ejemplar.setLibro(ld.buscarLibroXId(rs.getInt(CAMPOS[1])));
                ejemplar.setId(rs.getInt(CAMPOS[0]));
                ejemplar.setEstado(rs.getInt(CAMPOS[2]));

            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return ejemplar;
    }

    public java.util.List<Entidades.Ejemplar> obtenerEjemplares() {
        Entidades.Ejemplar ejemplar;
        java.util.ArrayList<Entidades.Ejemplar> ejemplares = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + TABLA + ";";
        LibroData ld = new LibroData(conaux);
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ejemplar = new Entidades.Ejemplar();
                ejemplar.setId(rs.getInt(CAMPOS[0]));
                ejemplar.setLibro(ld.buscarLibroXId(rs.getInt(CAMPOS[1])));
                ejemplar.setEstado(rs.getInt(CAMPOS[2]));
                ejemplares.add(ejemplar);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return ejemplares;
    }
    
    public java.util.List<Entidades.Ejemplar> buscarDisponibles(String nombreLibro) {
        Entidades.Ejemplar ejemplar;
        java.util.ArrayList<Entidades.Ejemplar> ejemplares = new java.util.ArrayList<>();
        String sql = "SELECT e.* FROM ejemplares AS e, libros AS l "
                + "WHERE l.nombre LIKE \"%"+ nombreLibro +"%\" "
                + "AND e.id_libro = l.id_libro "
                + "AND e.estado = 3;";
        LibroData ld = new LibroData(conaux);
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ejemplar = new Entidades.Ejemplar();
                ejemplar.setId(rs.getInt(CAMPOS[0]));
                ejemplar.setLibro(ld.buscarLibroXId(rs.getInt(CAMPOS[1])));
                ejemplar.setEstado(rs.getInt(CAMPOS[2]));
                ejemplares.add(ejemplar);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return ejemplares;
    }
    
    private void error(Object ex) {
        System.out.println("Error: " + ex);
        this.ex = ex;
    }
}
