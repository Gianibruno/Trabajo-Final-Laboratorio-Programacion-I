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

/**
 * Trabajo Practico Final
 * Biblioteca
 */
public class Grupo1TPFinal {
    
    // <editor-fold defaultstate="collapsed" desc=" Variables static ">
    public static final BD.Conexion CONEXION = new BD.Conexion();
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" Atributos ">
    
    // </editor-fold>
    
    /**
     * Metodo main argumentos no usamos por el momento.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Laboratorio 1: Trabajo Práctico Final.\nGrupo 1.");
        
        // <editor-fold defaultstate="collapsed" desc=" Pruebas de Clases Entidad, Data, y Conexion ">
//        /*......................................................................//Inicio de Pruebas
        
        System.out.println("Prueba Entidades:\n-----------------");//...........Probar las Entidades
        //Autor
        
        //Ejemplar
        
        //Lector
        
        //Libro
        
        //Multa
        
        //Prestamo
        
        System.out.println("FIN Prueba Entidades\n");//.........................Probar las Entidades
        
        System.out.println("Prueba de Conexion:\n-----------------");//.........Probar la parte de conexion
        CONEXION.Conectar();
        if(CONEXION.esValida()){
            System.out.println("Conexion OK");
            System.out.println("\tPrueba de Clases Data:\n");//.................Probar Clases Data
            //Autor

            //Ejemplar

            //Lector

            //Libro

            //Multa

            //Prestamo
            
            System.out.println("\tFIN Prueba de Clases Data\n");
        }else{
            System.out.println("Error en la Conexion: "+ CONEXION.getExcepcion());
        }
        System.out.println("FIN Prueba de Conexion:\n");
//        ......................................................................*///Fin Pruebas
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc=" Pre-Inicio de GUI ">
        System.out.println("Cargando GUI");
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc=" GUI ">
        System.out.println("GUI Principal con menu");
        GUI.Principal.iniciar();//..............................................GUI
        // </editor-fold>
    }
    
}
