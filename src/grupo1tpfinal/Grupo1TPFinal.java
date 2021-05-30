/*
 * TUDS
 * Laboratorio 1
 * Trabajo Practico Final
 * Grupo 1:
 * Astor Arico
 * Gianfranco Bruno
 * Di-Mauro Melisa
 * Barrionuevo Pablo
 */
package grupo1tpfinal;
//asd

/**
 *
 * @author giani
 */
public class Grupo1TPFinal {
    
    //Variables static
    public static BD.Conexion CONEXION;
    
    //Atributos
    
    
    /**
     * Metodo main argumentos no usamos por el momento.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Laboratorio 1: Trabajo Práctico Final.\nGrupo 1.");
        /*......................................................................//Inicio de Pruebas
        
        System.out.println("Prueba Logica:\n");//...............................Probar la Logica
        //Libro
        
        //Ejemplares o Biblioteca
        
        //...
        
        System.out.println("Prueba de Conexion:\n");//..........................Probar la parte de conexion
        CONEXION = new BD.Conexion();//("Biblioteca", "root", "");
        if(CONEXION.Conectar() != null){
            System.out.println("Conexion OK");
            System.out.println("Prueba de Clases Data");//......................Probar Clases Data
            //Libros
            //...
        }else{
            System.out.println("Conexion Error");
        }
        ......................................................................*///Fin Pruebas
        //inicializaciones, preparaciones antes de iniciar GUI
        CONEXION = new BD.Conexion();
        GUI.Principal.iniciar();//..............................................GUI
    }
    
}
