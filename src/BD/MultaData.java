/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * Clase Data: Multa
 * 
 */
public class MultaData {
    //Constantes
    final private String TABLA = "multa",
            CAMPOS[] = {"id_multa","id_prestamo", "fecha_inicio", "fecha_fin"};
    //Atributos
    private java.sql.PreparedStatement ps = null;
    private java.sql.ResultSet rs = null;
    private java.sql.Connection con = null;
    private Exception ex = null;
    private BD.Conexion conexion = null;

    public MultaData(Conexion con) {
        this.con = con.getConexion();
        conexion = con;
    }
    
    public Exception getExcepcion(){
        return ex;
    }
    
    public int guardar(Entidades.Multa multa) {
        int idnuevo = 0;
        String sql = "INSERT INTO " + TABLA + " ("
                + CAMPOS[1] + ", "
                + CAMPOS[2] + ", "
               
                + CAMPOS[3] + ") VALUES (?,?, ?);";
        if (multa != null) {
            try {
                ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, multa.getPrestamo().getIdPrestamo());
                ps.setDate(2, java.sql.Date.valueOf(multa.getFecha_inicio()));
                ps.setDate(3, java.sql.Date.valueOf(multa.getFecha_fin()));
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
   
    public int modificar(Entidades.Multa multa) {
        int respuesta = 0;
        String sql = "UPDATE " + TABLA + " SET "
                + CAMPOS[1] + "=?, "
                + CAMPOS[2] + "=?, "
                + CAMPOS[3] + "=? "
                
                + "WHERE " + CAMPOS[0] + "=?;";
        if (multa != null && multa.getId_multa()> 0) {
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, multa.getPrestamo().getIdPrestamo());
                ps.setDate(2, java.sql.Date.valueOf(multa.getFecha_fin()));
                ps.setDate(3, java.sql.Date.valueOf(multa.getFecha_inicio()));
                ps.setInt(4, multa.getId_multa());
                ps.executeUpdate();
                ps.close();
                respuesta = 1;
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return respuesta;
    }

    public java.util.List<Entidades.Multa> obtenerMultas() {
        Entidades.Multa multa;
        java.util.ArrayList<Entidades.Multa> multas = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + TABLA + ";";
        BD.PrestamoData pd = new BD.PrestamoData(conexion);
        Entidades.Prestamo prestamo;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                prestamo = pd.buscar(rs.getInt(CAMPOS[1]));
                multa = new Entidades.Multa();
                multa.setId_multa(rs.getInt(CAMPOS[0]));
                multa.setPrestamo(prestamo);
                multa.setFecha_inicio(java.time.LocalDate.parse(rs.getString(CAMPOS[2])));
                multa.setFecha_fin(java.time.LocalDate.parse(rs.getString(CAMPOS[3])));
               
                multas.add(multa);
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return multas;
    }
    
     public Entidades.Multa buscarMulta(Entidades.Multa multa) {
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[0] + "=?;";
        BD.PrestamoData pd = new BD.PrestamoData(conexion);
        Entidades.Prestamo prestamo;
        if(multa != null){
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, multa.getId_multa());
                rs = ps.executeQuery();
                if (rs.next()) {
                    prestamo = pd.buscar(rs.getInt(CAMPOS[1]));
                    multa = new Entidades.Multa(
                            prestamo,
                            java.time.LocalDate.parse(rs.getString(CAMPOS[2])),
                            java.time.LocalDate.parse(rs.getString(CAMPOS[3]))
                    );
                    multa.setId_multa(rs.getInt(CAMPOS[0]));
                }
                ps.close();
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return multa;
    }
    
     public Entidades.Multa buscarMulta(int id_multa) {
        Entidades.Multa multa = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[0] + "=?;";
         BD.PrestamoData pd = new BD.PrestamoData(conexion);
        Entidades.Prestamo prestamo;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_multa);
            rs = ps.executeQuery();
            if (rs.next()) {
                prestamo = pd.buscar(rs.getInt(CAMPOS[1]));
                multa = new Entidades.Multa(
                        prestamo,
                        java.time.LocalDate.parse(rs.getString(CAMPOS[2])),
                        java.time.LocalDate.parse(rs.getString(CAMPOS[3]))
                );
                multa.setId_multa(rs.getInt(CAMPOS[0]));
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return multa;
    }
    
     public Entidades.Multa buscarMulta(Entidades.Prestamo prestamo) {
        Entidades.Multa multa = null;
        String sql = "SELECT * FROM " + TABLA + " WHERE " + CAMPOS[1] + " = ?;";
        BD.PrestamoData pd = new BD.PrestamoData(conexion);
        if(prestamo != null && prestamo.getIdPrestamo() > 0){
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, prestamo.getIdPrestamo());
                rs = ps.executeQuery();
                if (rs.next()) {
                    multa = new Entidades.Multa(
                            prestamo,
                            java.time.LocalDate.parse(rs.getString(CAMPOS[2])),
                            java.time.LocalDate.parse(rs.getString(CAMPOS[3]))
                    );
                    multa.setId_multa(rs.getInt(CAMPOS[0]));
                }
                ps.close();
            } catch (java.sql.SQLException ex) {
                error(ex);
            }
        }
        return multa;
    }

    private void error(Exception ex) {
        System.out.println("Error: " + ex);
        this.ex = ex;
    }

     public void borrarMulta (int id_multa){
        String sql = "Delete from multa where id_multa=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_multa);
            rs = ps.executeQuery();
            ps.executeUpdate();
            ps.close();
            
        } catch (java.sql.SQLException ex) {
           error(ex);
        }
        
    }
    
}


