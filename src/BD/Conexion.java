/*
 * Clase de Conexion a la BD
 */
package BD;
/**
 * La Conexion se establece usando XAMPP con MariaDB.
 * @author Astor, Meli, Bruno, Pablo
 * /------------------------------------------------------------------------------------\ *
 * |                                                                                    | *
 * |¿Como Usar?:                                                                        | *
 * |                                                                                    | *
 * |------------------------------------------------------------------------------------| *
 * |                                                                                    | *
 * |Declaración:                                                                        | *
 * |BD.Conexion laConexion;                                                             | *
 * |                                                                                    | *
 * |------------------------------------------------------------------------------------| *
 * |                                                                                    | *
 * |Instanciación: (inicialización)                                                     | *
 * |Forma 1)- laConexion = new BD.Conexion();                                           | *
 * |Forma 2)- laConexion = new BD.Conexion("nombreDeLaBD", "usuario", "password");      | *
 * |Forma 3)- laConexion = new BD.Conexion("nombreDeLaBD", 3306, "usuario", "password");| *
 * |                                                                                    | *
 * |------------------------------------------------------------------------------------| *
 * |                                                                                    | *
 * |Getters:                                                                            | *
 * |laConexion.getConexion(); devuelve Connection o null si excepción                   | *
 * |laConexion.getExcepcion(); devuelve la ultima excepcion                             | *
 * |                                                                                    | *
 * |------------------------------------------------------------------------------------| *
 * |                                                                                    | *
 * |Setters: todos devuelve un objeto de tipo Conexion.                                 | *
 * |laConexion.setNombreBD("OtraBD");                                                   | *
 * |laConexion.setPuerto(8008);                                                         | *
 * |laConexion.setUsuario("otroUsuario");                                               | *
 * |laConexion.setPassword("otroPassword");                                             | *
 * |                                                                                    | *
 * |------------------------------------------------------------------------------------| *
 * |                                                                                    | *
 * |Metodos:                                                                            | *
 * |laConexion.conectar(); devuelven un objeto de tipo Conexion.                        | *
 * |laConexion.esValida(); devuelve true si puede hacer query a la BD                   | *
 * |                                                                                    | *
 * |------------------------------------------------------------------------------------| *
 * |                                                                                    | *
 * |Aquellos que devuelve un objeto de tipo Conexion se pueden usar de la sig. forma:   | *
 * |laConexion.setPuerto(808).setNombreBD(biblioteca).conectar().esValida();            | *
 * |                                                                                    | *
 * \------------------------------------------------------------------------------------/ */

public class Conexion {
    // <editor-fold defaultstate="collapsed" desc=" Atributos ">
    private String 
            dir,
            nombreBD,
            usuario,
            pass,
            url;
    private int puerto;
    private java.sql.Connection conexion = null;
    private Object excepcion = null;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Constructores ">
    /**
     * Arma y crea una Conexion con datos predeterminados.                      
     * url = "jdbc:mariadb://localhost:3306/bibliotecaGrupo1".                  
     * usuario = "root".                                                        
     * contraseña = "".                                                         
     */
    public Conexion() {
        usuario = CONF.USUARIO;
        pass = CONF.PASS;
        url(null, 0, null);
        registrarDriver();
        mensaje(null);
    }
    
    /**
     * Arma y crea una Conexion a la BD.                                        
     * @param nombreBD el nombre de la Base de Datos.                           
     * @param usuario
     * @param pass 
     */
    public Conexion(String nombreBD, String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
        url(null, 0, nombreBD);
        registrarDriver();
        mensaje(null);
    }
    /**
     * Arma y crea una Conexion a la BD
     * @param nombreBD el nombre de la Base de Datos
     * @param puerto
     * @param usuario
     * @param pass 
     */
    public Conexion(String nombreBD, int puerto, String usuario, String pass){
        url(null, puerto, nombreBD);
        this.usuario = usuario;
        this.pass = pass;
        registrarDriver();
        mensaje(null);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Metodos Getters ">
    /**
     * Devuelve una java.sql.Connection o null si error al ejecutar conectar().
     * @return 
     */
    public java.sql.Connection getConexion(){
        return conexion;
    }
    /**
     * Devuelve la ultima Excepcion registrada
     * @return 
     */
    public Object getExcepcion(){
        return excepcion;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Metodos Setters ">
    /**
     * Cambiar el nombre de la BD en el URL de la conexion
     * @return un Objeto Conexion para anidar metodos.
     */
    public Conexion setNombreBD(String nombreBD){
        url(null,0,nombreBD);
        return this;
    }
    /**
     * Cambiar el puerto en el URL de la conexion
     * @param puerto
     * @return un Objeto Conexion para anidar metodos.
     */
    public Conexion setPuerto(int puerto){
        url(null,puerto,null);
        return this;
    }
    /**
     * Setter para el nombre del usuario
     * @param usuario 
     * @return un Objeto Conexion para anidar metodos.
     */
    public Conexion setUsuario(String usuario){
        this.usuario = usuario;
        return this;
    }
    /**
     * Setter para la contraseña del usuario
     * @param pass 
     */
    public Conexion setPassword(String pass){
        this.pass = pass;
        return this;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Metodos Publicos ">
    /**
     * Intenta establecer una conexion a la BD, devuelve null si no es posible
     * @return 
     */
    public Conexion Conectar(){
        if(conexion == null){
            try {
                conexion = java.sql.DriverManager.getConnection( url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"// + "&user"+ usuario + "&password=" +pass
                        ,usuario, pass);
                mensaje("Conectar se ejecuto con exito:\nURL: "+url+"\nUsuario: "+usuario+"\nPassword: "+pass);
            } catch (java.sql.SQLException ex) {
                //javax.swing.JOptionPane.showMessageDialog(null, "Error al Conectar: \n"+ex);
                mensaje("Error al Conectar: "+ex.getMessage());
                excepcion = ex;
                conexion = null;
            }
        }
        return this;
    }
    /**
     * Comprueba si la conexion a la BD es valida
     * @return true si esta conectado, false si no se puede hacer query
     */
    public boolean esValida(){
        try {
            return conexion.isValid(1000);
        } catch (java.sql.SQLException ex) {
            excepcion = ex;
            return false;
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Metodos Privados ">
    /**
     * Metodo utilizado desde los constructores, registra el driver de mariadb en la MVJava
     */
    private void registrarDriver(){
        try {
            Class.forName(CONF.DRIVER);
        } catch (ClassNotFoundException ex) {
            //javax.swing.JOptionPane.showMessageDialog(null, "Error de libreria: \n"+ex);
            mensaje("Error al registrar Driver: "+ ex.getMessage());
            excepcion = ex;
        }
    }
    /**
     * Metodo para mostrar un mensaje en consola
     * @param msg 
     */
    private void mensaje(String msg) {
        if(msg == null)
            System.out.println("Nueva conexion:\nURL: \""+ url + "\".\nUSUARIO: \""+ usuario + "\".\nPASSWORD: \""+ pass + "\".");
        else
            System.out.println(msg);
    }
    /**
     * Metodo para establecer y devolver url
     * @param dir puede ser null para usar CONF.DIR
     * @param puerto puede ser 0 para usar CONF.PUERTO
     * @param nombreBD puede ser null para usar CONF.BD
     */
    private void url(String dir, int puerto, String nombreBD) {
        this.dir      = (dir != null)      ? dir      : (this.dir != null)      ? (!this.dir.equals(CONF.DIR))     ? this.dir      : CONF.DIR    : CONF.DIR;
        this.puerto   = (puerto != 0)      ? puerto   : (this.puerto != 0)      ? (this.puerto != CONF.PUERTO)     ? this.puerto   : CONF.PUERTO : CONF.PUERTO;
        this.nombreBD = (nombreBD != null) ? nombreBD : (this.nombreBD != null) ? (!this.nombreBD.equals(CONF.BD)) ? this.nombreBD : CONF.BD     : CONF.BD;
        url = "jdbc:mariadb://"+ this.dir +":"+ this.puerto +"/"+ this.nombreBD +"";
        //mensaje(url);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Clase CONFIGURACIONES PREDETERMINADAS ">
    /**
     * Configuraciones predeterminadas de acceso
     */
    private static final class CONF{
        static final String 
                DRIVER = "org.mariadb.jdbc.Driver",
                DIR = "localhost",
                BD = "bibliotecaGrupo1",
                USUARIO = "root",
                PASS = "";
        static final int PUERTO = 3306;
    }
    // </editor-fold>
}
/*
Pruebas:
1)- Conexion();
2)- setPuerto(808);
3)- setNombreBD("bibliotecaGrupo1");
----------------------------------------
    dir        |  puerto  |  nombreBD          |  url
1)- localhost  |  3306    |  Biblioteca        |  jdbc:mariadb://localhost:3306/Biblioteca
2)- localhost  |  808     |  Biblioteca        |  jdbc:mariadb://localhost:808/Biblioteca
3)- localhost  |  808     |  bibliotecaGrupo1  |  jdbc:mariadb://localhost:808/bibliotecaGrupo1
*/