/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * Clase Data: Libro
 *
 */
public class LibroData {
    //Constantes

    final private String TABLA = "libros",
            CAMPOS[] = {"id_libro", "id_autor", "isbn", "nombre", "tipo", "editorial", "año", "estado"};
    //Atributos
    private java.sql.PreparedStatement ps = null;
    private java.sql.ResultSet rs = null;
    private java.sql.Connection con = null;
    private Object ex = null;
    private Conexion conaux = null;

    public LibroData(Conexion con) {
        this.con = con.getConexion();
        this.conaux = con;

    }

    public Object getExcepcion() {
        return ex;
    }

    public int guardar(Entidades.Libro libro) {
        int idnuevo = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + ", "
                + CAMPOS[4] + ", "
                + CAMPOS[5] + ", "
                + CAMPOS[6] + ", "
                + CAMPOS[7] + ") VALUES (?,?,?,?,?,?,?);";
        if (libro != null) {
            try {
                ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, libro.getAutor().getIdAutor());
                ps.setLong(2, libro.getIsbn());
                ps.setString(3, libro.getNombre());
                ps.setString(4, libro.getTipo());
                ps.setString(5, libro.getEditorial());
                ps.setInt(6, libro.getAño());
                ps.setInt(7, libro.getEstado());
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

    public int modificar(Entidades.Libro libro) {
        int respuesta = 0;
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[1] + "=?, "
                + CAMPOS[2] + "=?, "
                + CAMPOS[3] + "=?, "
                + CAMPOS[4] + "=? "
                + CAMPOS[5] + "=? "
                + CAMPOS[6] + "=? "
                + CAMPOS[7] + "=? "
                + "WHERE " + CAMPOS[0] + "=?;";
        if (libro != null && libro.getId() > 0) {
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, libro.getAutor().getIdAutor());
                ps.setLong(2, libro.getIsbn());
                ps.setString(3, libro.getNombre());
                ps.setString(4, libro.getTipo());
                ps.setString(5, libro.getEditorial());
                ps.setInt(6, libro.getAño());
                ps.setInt(7, libro.getEstado());
                ps.executeUpdate();
                ps.close();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }

    public java.util.List<Entidades.Libro> obtenerLibros() {
        Entidades.Libro libro;
        java.util.ArrayList<Entidades.Libro> libros = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + TABLA + ";";
        AutorData ad = new AutorData(conaux);
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro = new Entidades.Libro();
                libro.setId(rs.getInt(CAMPOS[0]));
                libro.setAutor(ad.buscarAutorXId(Integer.parseInt(rs.getString(CAMPOS[1]))));
                libro.setIsbn(rs.getLong(CAMPOS[2]));
                libro.setNombre(rs.getString(CAMPOS[3]));
                libro.setTipo(rs.getString(CAMPOS[4]));
                libro.setEditorial(rs.getString(CAMPOS[5]));
                libro.setAño(rs.getShort(CAMPOS[6]));
                libro.setEstado(rs.getInt(CAMPOS[7]));
                libros.add(libro);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return libros;
    }

    public Entidades.Libro buscarLibro(long isbn) {
        Entidades.Libro libro = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[2] + "=?;";
        AutorData ad = new AutorData(conaux);
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, isbn);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro = new Entidades.Libro();
                libro.setId(rs.getInt(CAMPOS[0]));
                libro.setAutor(ad.buscarAutorXId(Integer.parseInt(rs.getString(CAMPOS[1]))));
                libro.setIsbn(rs.getLong(CAMPOS[2]));
                libro.setNombre(rs.getString(CAMPOS[3]));
                libro.setTipo(rs.getString(CAMPOS[4]));
                libro.setEditorial(rs.getString(CAMPOS[5]));
                libro.setAño(rs.getShort(CAMPOS[6]));
                libro.setEstado(rs.getInt(CAMPOS[7]));
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return libro;
    }
    
    public Entidades.Libro buscarLibroXId(int id) {
        Entidades.Libro libro = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[0] + "=?;";
        AutorData ad = new AutorData(conaux);
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro = new Entidades.Libro();
                libro.setId(rs.getInt(CAMPOS[0]));
                libro.setAutor(ad.buscarAutorXId(rs.getInt(CAMPOS[1])));
                libro.setIsbn(rs.getLong(CAMPOS[2]));
                libro.setNombre(rs.getString(CAMPOS[3]));
                libro.setTipo(rs.getString(CAMPOS[4]));
                libro.setEditorial(rs.getString(CAMPOS[5]));
                libro.setAño(rs.getShort(CAMPOS[6]));
                libro.setEstado(rs.getInt(CAMPOS[7]));
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return libro;
    }
    
    private void error(Object ex) {
        System.out.println("Error: " + ex);
        this.ex = ex;
    }
}
