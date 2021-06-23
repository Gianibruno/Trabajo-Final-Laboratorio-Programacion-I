/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Data
 */
package BD;

/**
 * Clase Data: Biblioteca que contiene información
 * 
 */
public class BibliotecaData {
    //Constantes
    final private String TABLA = "info",
            CAMPOS[] = {"nombre", "direccion", "telefono", "contacto", "director", "director_contacto"};
    //Atributos
    private java.sql.PreparedStatement ps = null;
    private java.sql.ResultSet rs = null;
    private java.sql.Connection con = null;
    private Object ex = null;
    
    public BibliotecaData(Conexion con){
        this.con = con.getConexion();
    }
    
    public Object getExcepcion() {
        return ex;
    }
    
    public Biblioteca getInfo(){
        Biblioteca respuesta = null;
        String sql = "SELECT * FROM " + TABLA + ";";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                respuesta = new Biblioteca(
                    rs.getString(CAMPOS[0]),
                    rs.getString(CAMPOS[1]),
                    rs.getString(CAMPOS[2]),
                    rs.getString(CAMPOS[3]),
                    rs.getString(CAMPOS[4]),
                    rs.getString(CAMPOS[5])
                );
            }
            ps.close();
        } catch (java.sql.SQLException ex) {
            error(ex);
        }
        return respuesta;
    }
    
    private void error(Object ex) {
        System.out.println("Error: " + ex);
        this.ex = ex;
    }
    
    public static class Biblioteca{
        //Atributos
        private String 
                nombre,
                direccion,
                telefono,
                contacto,
                director,
                dirContacto;

        public Biblioteca(){
            nombre = "";
            direccion = "";
            telefono = "";
            contacto = "";
            director = "";
            dirContacto = "";
        }
        
        public Biblioteca(String nombre, String direccion, String telefono, String contacto, String director, String dirContacto) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.contacto = contacto;
            this.director = director;
            this.dirContacto = dirContacto;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public String getContacto() {
            return contacto;
        }

        public String getDirector() {
            return director;
        }

        public String getDirContacto() {
            return dirContacto;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public void setContacto(String contacto) {
            this.contacto = contacto;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public void setDirContacto(String dirContacto) {
            this.dirContacto = dirContacto;
        }
    }
}
