/*
 * Clase de Conexion a la BD
 */
package BD;

/**
 * La Conexion se establece usando XAMPP con MariaDB
 * @author Astor, Meli, Bruno, Pablo
 */
public class Conexion {
    /**
     * Configuraciones predeterminadas de acceso
     */
    private static final class CONF{
        static final String DRIVER = "org.mariadb.jdbc.Driver";
        static final String DIR = "localhost";
        static final String BD = "Biblioteca";
        static final String PUERTO = "3306";
        static final String USUARIO = "root";
        static final String PASS = "";
    }
    //Atributos
    private String url;
    private String usuario;
    private String pass;
    private java.sql.Connection conexion = null;
    
    //Constructores
    /**
     * Arma y crea una Conexion con datos predeterminados
     * url = "jdbc:mariadb://localhost:3306/Biblioteca"
     * usuario = "root"
     * contraseña = ""
     */
    public Conexion() {
        url = "jdbc:mariadb://"+ CONF.DIR +":"+ CONF.PUERTO +"/"+ CONF.BD;
        usuario = CONF.USUARIO;
        pass = CONF.PASS;
        registrarDriver();
        System.out.println("Nueva Conexion:\n"
                + "URL: "+ url +".\n"
                + "Usuario: "+ usuario +".\n"
                + "Password: "+ pass +".\n");
    }
    
    /**
     * Arma y crea una Conexion a la BD
     * @param nombreBD el nombre de la Base de Datos
     * @param usuario
     * @param pass 
     */
    public Conexion(String nombreBD, String usuario, String pass) {
        url = "jdbc:mariadb://"+ CONF.DIR +":"+ CONF.PUERTO +"/"+ nombreBD;
        this.usuario = usuario;
        this.pass = pass;
        System.out.println("Nueva Conexion:\n"
                + "URL: "+ url +".\n"
                + "Usuario: "+ usuario +".\n"
                + "Password: "+ pass +".\n");
        registrarDriver();
    }
    
    //Getter de conecction
    /**
     * Devuelve una java.sql.Connection o null si error al ejecutar conectar().
     * @return 
     */
    public java.sql.Connection getConexion(){
        return conexion;
    }
    
    //Setter de usuario y pass
    /**
     * Setter para el nombre del usuario
     * @param usuario 
     */
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    /**
     * Setter para la contraseña del usuario
     * @param pass 
     */
    public void setPassword(String pass){
        this.pass = pass;
    }
    
    //Metodos publicos
    
    /**
     * Cambiar el nombre de la BD en el URL de la conexion
     */
    public void setNombreBD(String nombreBD){
        url = url = "jdbc:mariadb://"+ CONF.DIR +":"+ CONF.PUERTO +"/"+ nombreBD;;
    }
    
    /**
     * Intenta establecer una conexion a la BD, devuelve null si no es posible
     * @return 
     */
    public java.sql.Connection Conectar(){
        if(conexion == null){
            try {
                conexion = java.sql.DriverManager.getConnection( url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"// + "&user"+ usuario + "&password=" +pass
                        ,usuario, pass);
                System.out.println("Conectar se ejecuto con exito:\nURL: "+url+"\nUsuario: "+usuario+"\nPassword: "+pass);
            } catch (java.sql.SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error al Conectar: \n"+ex);
                System.out.println("Error al Conectar: "+ex);
                conexion = null;
            }
        }
        return conexion;
    }
    
    //Metodos privados
    /**
     * Metodo utilizado desde los constructores, registra el driver de mariadb en la MVJava
     */
    private void registrarDriver(){
        try {
            Class.forName(CONF.DRIVER);
        } catch (ClassNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error de libreria: \n"+ex);
            System.out.println("Error al registrar Driver: "+ ex);
        }
    }
}
