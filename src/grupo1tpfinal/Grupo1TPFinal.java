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
        // <editor-fold defaultstate="collapsed" desc=" Autor ">
//        System.out.println("\tEntidad de Autor: ");
//        Entidades.Autor autor = new Entidades.Autor("123","Nombre del Autor", "Nacionalidad",java.time.LocalDate.of(1500, 5, 20));
//        autor.setNacionalidad("Argentina");
//        System.out.println("\t\tAutor {"
//                + "idAutor: "+ autor.getIdAutor() +", "
//                + "DNI: "+ autor.getDni()+", "
//                + "Nombre: "+ autor.getNombre() +", "
//                + "Nacionalidad: "+ autor.getNacionalidad() +", "
//                + "Fecha de Nacimiento: "+ autor.getFechaNacimiento().toString()+", "
//                + "Estado: "+ autor.getEstado() +" "
//                + "}.");
        // </editor-fold>
        
        //Ejemplar
        
        // <editor-fold defaultstate="collapsed" desc=" Lector ">
//        System.out.println("\tEntidad de Lector: ");
//        Entidades.Lector lector = new Entidades.Lector("123","Nombre del Lector", java.time.LocalDate.of(1500, 5, 20));
//        lector.setTelefono("2664888888");lector.setDireccion("No");
//        System.out.println("\t\tLector {"
//                + "idLector: "+ lector.getIdLector() +", "
//                + "DNI: "+ lector.getDni()+", "
//                + "Nombre: "+ lector.getNombre() +", "
//                + "Telefono: "+ lector.getTelefono() +", "
//                + "Direccion: "+ lector.getDireccion()+", "
//                + "Fecha de Nacimiento: "+ lector.getFechaNacimiento().toString()+", "
//                + "Estado: "+ lector.getEstado() +" "
//                + "}.");
        // </editor-fold>
        
        //Multa
        
        //<editor-fold defaultstate="collapsed" desc=" Prestamo ">
//        System.out.println("\tEntidad de Prestamo: ");
//        Entidades.Prestamo prestamo = new Entidades.Prestamo();
//        prestamo.setIdPrestamo(0); prestamo.setIdEjemplar(6); prestamo.setIdLector(1);
//        prestamo.setFechaPrestamo(java.time.LocalDate.now()); prestamo.setFechaDevolucion(java.time.LocalDate.now());
//        System.out.println("\t\tPrestamo {"
//            + "idPrestamo: " + prestamo.getIdPrestamo() +", "
//            + "idEjemplar: " + prestamo.getIdEjemplar() +", "
//            + "idLector: " +   prestamo.getIdLector()   +", "
//            + "fechaPrestamo: "+ prestamo.getFechaPrestamo() +", "
//            + "fechaDevolucion: "+ prestamo.getFechaDevolucion() +"}."
//        );
        //</editor-fold>
        
        System.out.println("FIN Prueba Entidades\n");//.........................Probar las Entidades
        
        System.out.println("Prueba de Conexion:\n-----------------");//.........Probar la parte de conexion
        CONEXION.Conectar();
        if(CONEXION.esValida()){
            System.out.println("Conexion OK");
            System.out.println("\tPrueba de Clases Data:\n");//.................Probar Clases Data
            
            //<editor-fold defaultstate="collapsed" desc=" AutorData ">
            System.out.println("\t\tPrueba de AutorData:\n");
            BD.AutorData ad = new BD.AutorData(CONEXION);
            
            //..................................................................Probar guardar(Autor);
//            Entidades.Autor guardaAutor = new Entidades.Autor("55.888.444", "Autor de grandes mitos", "Argentina", java.time.LocalDate.of(1985, 12, 25));
//            guardaAutor.setIdAutor(ad.guardar(guardaAutor));
//            if(guardaAutor.getIdAutor() > 0){
//                System.out.println("\t\tExito al guardar un Autor.");
//            }else{
//                System.out.println("\t\tERROR al guardar un Autor.");
//            }
            
            //..................................................................Probar modificar(Autor);
//            Entidades.Autor modificarAutor = new Entidades.Autor();
//            modificarAutor.setIdAutor(2);modificarAutor.setNombre("SOS");modificarAutor.setNacionalidad("SOS");
//            modificarAutor.setFechaNacimiento(java.time.LocalDate.now());
//            if(ad.modificar(modificarAutor) == 1){
//                System.out.println("\t\tExito al modificar un Autor.");
//            }else{
//                System.out.println("\t\tERROR al modificar un Autor.");
//            }

            //..................................................................Probar desactivar(idAutor);
//            if(ad.desactivar(3) == 1){
//                System.out.println("\t\tExito al desactivar un Autor.");
//            }else{
//                System.out.println("\t\tExito al desactivar un Autor.");
//            }

            //..................................................................Probar activar(idAutor);
//            if(ad.activar(3) == 1){
//                System.out.println("\t\tExito al activar un Autor.");
//            }else{
//                System.out.println("\t\tExito al activar un Autor.");
//            }
            
            //..................................................................Probar buscarAutor(Autor);
//            Entidades.Autor buscarAutor = ad.buscarAutor("55.888.444");
//            if(buscarAutor.getIdAutor() > 0){
//                System.out.println("\t\tExito al buscar un Autor.\n" 
//                        + buscarAutor.getNombre());
//            }else{
//                System.out.println("\t\tERROR al buscar un Autor.");
//            }
            
            //..................................................................Probar obtenerAutores();
//            java.util.List<Entidades.Autor> obtenerAutores = ad.obtenerAutores();
//            if(obtenerAutores.size() > 0){
//                System.out.println("\t\tExito al obtener Autores:\n" 
//                        + java.util.Arrays.toString(obtenerAutores.toArray()));
//            }else{
//                System.out.println("\t\tERROR al obtener listado de Autores.");
//            }
            
            System.out.println("\t\tFIN Prueba de AutorData:\n");
            //</editor-fold>

            //Ejemplar

            //<editor-fold defaultstate="collapsed" desc=" LectorData ">
            System.out.println("\t\tPrueba de LectorData:\n");
            BD.LectorData ld = new BD.LectorData(CONEXION);
            
            //..................................................................Probar guardar(Lector);
//            Entidades.Lector guardaLector = new Entidades.Lector("55.888.444", "Lector Rapido", java.time.LocalDate.of(1985, 12, 25));
//            guardaLector.setIdLector(ld.guardar(guardaLector));
//            if(guardaLector.getIdLector() > 0){
//                System.out.println("\t\tExito al guardar un Lector.");
//            }else{
//                System.out.println("\t\tERROR al guardar un Lector.");
//            }
            
            //..................................................................Probar modificar(Lector);
//            Entidades.Lector modificarLector = new Entidades.Lector("55.888.444", "Lector Rapido", java.time.LocalDate.of(1985, 12, 25));
//            modificarLector.setIdLector(3);modificarLector.setTelefono("NO POSEE");modificarLector.setDireccion("Su casa");
//            if(ld.modificar(modificarLector) == 1){
//                System.out.println("\t\tExito al modificar un Lector.");
//            }else{
//                System.out.println("\t\tERROR al modificar un Lector.");
//            }

            //..................................................................Probar desactivar(idLector);
//            if(ld.desactivar(3) == 1){
//                System.out.println("\t\tExito al desactivar un Lector.");
//            }else{
//                System.out.println("\t\tExito al desactivar un Lector.");
//            }

            //..................................................................Probar activar(idLector);
//            if(ld.activar(3) == 1){
//                System.out.println("\t\tExito al activar un Lector.");
//            }else{
//                System.out.println("\t\tExito al activar un Lector.");
//            }
            
            //..................................................................Probar buscarLector(Lector);
//            Entidades.Lector buscarLector = ld.buscarLector("55.888.444");
//            if(buscarLector.getIdLector() > 0){
//                System.out.println("\t\tExito al buscar un Lector.\n" 
//                        + buscarLector.getNombre());
//            }else{
//                System.out.println("\t\tERROR al buscar un Lector.");
//            }
            
            //..................................................................Probar obtenerLectores();
//            java.util.List<Entidades.Lector> obtenerLectores = ld.obtenerLectores();
//            if(obtenerLectores.size() > 0){
//                System.out.println("\t\tExito al listar Lectores.\n" 
//                        + java.util.Arrays.toString(obtenerLectores.toArray()));
//            }else{
//                System.out.println("\t\tERROR al listar Lectores.");
//            }
            
            System.out.println("\t\tFIN Prueba de AutorData:\n");
            //</editor-fold>

            //Libro

            //Multa

            //<editor-fold defaultstate="collapsed" desc=" PrestamoData ">
            System.out.println("\t\tPrueba de PrestamoData:\n");
            BD.PrestamoData pd = new BD.PrestamoData(CONEXION);
            
            //..................................................................Prueba registrar(Prestamo);
//            Entidades.Prestamo pruebaRegistrar = new Entidades.Prestamo(0, 11, 1, java.time.LocalDate.now(), java.time.LocalDate.of(2015, 12, 5));
//            pruebaRegistrar.setIdPrestamo(pd.registrar(pruebaRegistrar));
//            if(pruebaRegistrar.getIdPrestamo() > 0){
//                System.out.println("\t\tExito al Registrar Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Registrar Prestamo.");
//            }
            
            //..................................................................Prueba registrar(idEjemplar, idLector);
//            int idPrestamo = pd.registrar(10,2);
//            if(idPrestamo > 0){
//                System.out.println("\t\tExito al Registrar Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Registrar Prestamo.");
//            }

            //..................................................................Prueba modificar(Prestamo);
//            Entidades.Prestamo pruebaModificar = new Entidades.Prestamo(0, 4, 2, java.time.LocalDate.now());
//            pruebaModificar.setIdPrestamo(17);
//            pruebaModificar.setIdEjemplar(10);
//            if(pd.modificar(pruebaModificar) == 1){
//                System.out.println("\t\tExito al Modificar Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Modificar Prestamo.");
//            }

            //..................................................................Prueba modificar(idPrestamo, idLector, idEjemplar);
//            if(pd.modificar(17, 1, 9) == 1){
//                System.out.println("\t\tExito al Modificar Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Modificar Prestamo.");
//            }
            
            //..................................................................Prueba anular(Prestamo);
//            Entidades.Prestamo pruebaAnular = new Entidades.Prestamo(17, 0, 0, null);
//            if(pd.anular(pruebaAnular) == 1){
//                System.out.println("\t\tExito al Anular Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Anular Prestamo.");
//            }
            
            //..................................................................Prueba anular(idPrestamo);
//            if(pd.anular(2) == 1){
//                System.out.println("\t\tExito al Anular Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Anular Prestamo.");
//            }
            
            //..................................................................Prueba devolver(Prestamo);
//            Entidades.Prestamo pruebaDevolver = new Entidades.Prestamo(18, 0, 0, null, java.time.LocalDate.now());
//            if(pd.devolver(pruebaDevolver) == 1){
//                System.out.println("\t\tExito al Devolver un Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Devolver un Prestamo.");
//            }
            
            //..................................................................Prueba devolver(idPrestamo);
//            if(pd.devolver(18) == 1){
//                System.out.println("\t\tExito al Devolver un Prestamo.");
//            }else{
//                System.out.println("\t\tERROR al Devolver un Prestamo.");
//            }
            
            //..................................................................Prueba listar(fecha);
//            java.util.List<Entidades.Prestamo> listaPorFecha = pd.listar(java.time.LocalDate.now());
//            if(listaPorFecha.size() > 0){
//                System.out.println(java.util.Arrays.toString(listaPorFecha.toArray()));
//                System.out.println("\t\tExito al Listar Prestamos por Fecha.");
//            }else{
//                System.out.println("\t\tERROR al Listar Prestamos por Fecha. O no hay Prestamos en esa fecha.");
//            }

            //..................................................................Prueba listar(Lector);
//            Entidades.Lector pruebaListarLector = new Entidades.Lector(1L,"","",null);
//            pruebaListarLector.setIdLector(1);
//            java.util.List<Entidades.Prestamo> listaPorLector = pd.listar(pruebaListarLector);
//            if(listaPorLector.size() > 0){
//                System.out.println(java.util.Arrays.deepToString(listaPorLector.toArray()));
//                System.out.println("\t\tExito al Listar por Lector.");
//            }else{
//                System.out.println("\t\tERROR al Listar por Lector. O ese Lector no tiene prestamo.");
//            }

            //..................................................................Prueba listar(idLector);
//            java.util.List<Entidades.Prestamo> listaPorLector = pd.listar(1);
//            if(listaPorLector.size() > 0){
//                System.out.println(java.util.Arrays.deepToString(listaPorLector.toArray()));
//                System.out.println("\t\tExito al Listar por Lector.");
//            }else{
//                System.out.println("\t\tERROR al Listar por Lector. O ese Lector no tiene prestamo.");
//            }
            //..................................................................Prueba listarVencidos();
//            java.util.List<Entidades.Lector> listaVencidos = pd.listarVencidos();
//            if(listaVencidos.size() > 0){
//                System.out.println(java.util.Arrays.deepToString(listaVencidos.toArray()));
//                System.out.println("\t\tExito al Listar Prestamos Vencidos.");
//            }else{
//                System.out.println("\t\tERROR al Listar Prestamos Vencidos. O no hay Prestamos Vencidos.");
//            }
//            System.out.println("\t\tFIN Prueba de PrestamoData:\n");
            //</editor-fold>
            
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
