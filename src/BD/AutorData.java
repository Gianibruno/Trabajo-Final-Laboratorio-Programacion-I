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
            CAMPOS[] = {"id_autor", "dni", "nombre", "nacionalidad", "fechaNacimiento"};
    //Atributos
    private final java.sql.Connection con;

    public AutorData(Conexion con) {
        this.con = con.getConexion();
    }

    public int guardarAutor(Entidades.Autor autor) {
        int idnuevo = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
                + CAMPOS[3] + ", "
                + CAMPOS[4] + ") VALUES (?,?,?,?);";
        java.sql.PreparedStatement ps;
        java.sql.ResultSet rs;
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
            javax.swing.JOptionPane.showMessageDialog(null, "Error al intentar guardar Autor en base de datos: \n" + ex.getMessage());
        }
        if (idnuevo != 0) {
            System.out.println("Autor agregado con exito");
        }
        return idnuevo;
    }

    public java.util.List<Entidades.Autor> obtenerAutores() {
        Entidades.Autor autor;
        java.util.ArrayList<Entidades.Autor> autores = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + TABLA + ";";
        java.sql.PreparedStatement ps;
        java.sql.ResultSet rs;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                autor = new Entidades.Autor();
                autor.setDni(Long.parseLong(rs.getString(CAMPOS[1])));
                autor.setNombre(rs.getString(CAMPOS[2]));
                autor.setNacionalidad(rs.getString(CAMPOS[3]));
                autor.setFechaNacimiento(java.time.LocalDate.parse(rs.getString(CAMPOS[4])));
                autores.add(autor);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al listar Autores: \n" + ex.getMessage());
        }
        return autores;
    }

    public Entidades.Autor buscarAlumno(long dni) {
        Entidades.Autor autor = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[1] + "=?;";
        java.sql.PreparedStatement ps;
        java.sql.ResultSet rs;
        try {
            autor = new Entidades.Autor();
            ps = con.prepareStatement(sql);
            ps.setLong(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                autor.setDni(Long.parseLong(rs.getString(CAMPOS[1])));
                autor.setNombre(rs.getString(CAMPOS[2]));
                autor.setNacionalidad(rs.getString(CAMPOS[3]));
                autor.setFechaNacimiento(java.time.LocalDate.parse(rs.getString(CAMPOS[4])));
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al buscar Autor:\n" + ex.getMessage());
        }
        return autor;
    }

    public int actualizarAutor(Entidades.Autor autor,int dniOpcional) {
        
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[1] + "=?, "
                + CAMPOS[2] + "=?, "
                + CAMPOS[3] + "=?, "
                + CAMPOS[4] + "=? "
                + "WHERE " + CAMPOS[0] + "=?;";
        java.sql.PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            if(dniOpcional==0){
            ps.setString(1, autor.getDni()+"");
            }else{
            ps.setString(1, String.valueOf(dniOpcional));
            }
            ps.setString(2, autor.getNombre());
            ps.setString(3, autor.getNacionalidad());
            ps.setDate(4, java.sql.Date.valueOf(autor.getFechaNacimiento()));
            ps.executeUpdate();
            ps.close();
            return 1;
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al actualizar Autor: \n" + ex.getMessage());
        }
        return 0;
    }

}
