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
    public static BD.Conexion CONEXION;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" Atributos ">
    // nada por ahora
    // </editor-fold>
    
    /**
     * Metodo main argumentos:
     * 0 - 1: para realizar las pruebas.
     * 0 - 11: prueba de Entidades. Otro para no realizar la prueba.
     * 0 - 101: prueba de Conexion. Otro pra no realizar la prueba.
     * 0 - 1001: prueba de Clases Data. Otro para no realizar la prueba.
     * 1 - GUI: para cargar el GUI principal.
     * ejemplos:
     * 0 GUI -> sin pruebas con GUI.
     * 1 -> con mensaje de pruebas, sin GUI.
     * 1000 -> idem anterior.
     * 1100 -> mensaje de pruebas, prueba de Entidades, sin GUI.
     * 9876 -> sin pruebas sin GUI.
     * 9876 hola -> idem anterior.
     * etc.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de argumentos
        String argumentos[] = new String[]{};
        
        System.out.println("Laboratorio 1: Trabajo Práctico Final.\nGrupo 1.");
        CONEXION = new BD.Conexion();
        
        if(args.length > 0) argumentos = args[0].split("");
        
        // <editor-fold defaultstate="collapsed" desc=" Pruebas de Clases Entidad, Data, y Conexion ">
        if(argumentos.length > 0 && argumentos[0].equals("1")){
            System.out.println("Inicio de pruebas:..............\n");
            if(argumentos.length > 1 && argumentos[1].equals("1")){
                
                System.out.println("\nPrueba Entidades:\n-----------------");//.....Probar las Entidades
                //Entidades
                Entidades.Autor autor = new Entidades.Autor();
                Entidades.Lector lector = new Entidades.Lector();
                Entidades.Libro libro = new Entidades.Libro();
                Entidades.Ejemplar ejemplar = new Entidades.Ejemplar();
                Entidades.Prestamo prestamo = new Entidades.Prestamo();
                Entidades.Multa multa = new Entidades.Multa();
                
                //Pruebas con esas entidades
                // <editor-fold defaultstate="collapsed" desc=" Autor ">
                System.out.println("\tEntidad de Autor: ");
                autor.setIdAutor(1);
                autor.setNombre("El autor de prueba");
                autor.setNacionalidad("Argentina");
                autor.setFechaNacimiento(java.time.LocalDate.of(1855, 12, 31));
                autor.setEstado(1);
                System.out.println("\t\tAutor {"
                        + "idAutor: "+ autor.getIdAutor() +", "
                        + "DNI: "+ autor.getDni()+", "
                        + "Nombre: "+ autor.getNombre() +", "
                        + "Nacionalidad: "+ autor.getNacionalidad() +", "
                        + "Fecha de Nacimiento: "+ autor.getFechaNacimiento().toString() +", "
                        + "Estado: "+ autor.getEstado() +""
                        + "}.");
                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc=" Lector ">
                System.out.println("\tEntidad de Lector: ");
                lector.setIdLector(1);
                lector.setNombre("El lector de prueba");
                lector.setTelefono("2664888888");
                lector.setDireccion("No");
                lector.setFechaNacimiento(java.time.LocalDate.of(1985, 8, 25));
                lector.setEstado(1);
                System.out.println("\t\tLector {"
                        + "idLector: "+ lector.getIdLector()+", "
                        + "DNI: "+ lector.getDni()+", "
                        + "Nombre: "+ lector.getNombre() +", "
                        + "Telefono: "+ lector.getTelefono() +", "
                        + "Direccion: "+ lector.getDireccion() +", "
                        + "Fecha de Nacimiento: "+ lector.getFechaNacimiento().toString() +", "
                        + "Estado: "+ lector.getEstado() +""
                        + "}.");
                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc=" Libro ">
                System.out.println("\tEntidad de Libro: ");
                libro.setId(1);
                libro.setIsbn(111L);
                libro.setNombre("Un libro de prueba");
                libro.setTipo("Tipo de prueba");
                libro.setEditorial("Editorial de prueba");
                libro.setAño((short)2021);
                libro.setAutor(autor);
                libro.setEstado(1);
                System.out.println("\t\tLibro {"
                        + "idLibro: "+ libro.getId() +", "
                        + "ISBN: "+ libro.getIsbn() + ", "
                        + "Nombre: "+ libro.getNombre() +", "
                        + "Tipo: "+ libro.getTipo() +", "
                        + "Editorial: "+ libro.getEditorial() +", "
                        + "Año: "+ libro.getAño() +", "
                        + "Autor: "+ libro.getAutor().getNombre() +", "
                        + "Estado: "+ libro.getEstado() +""
                        + "}.");
                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc=" Ejemplar ">
                System.out.println("\tEntidad de Ejemplar: ");
                ejemplar.setId(1);
                ejemplar.setEstado(3);
                ejemplar.setLibro(libro);
                System.out.println("\t\tEjemplar {"
                        + "idEjemplar: "+ ejemplar.getId() +", "
                        + "Estado: "+ ejemplar.getEstado() +", "
                        + "Libro: "+ ejemplar.getLibro().getNombre() +""
                        + "}.");
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc=" Prestamo ">
                System.out.println("\tEntidad de Prestamo: ");
                prestamo.setIdPrestamo(1); 
                prestamo.setEjemplar(ejemplar);
                prestamo.setLector(lector);
                prestamo.setFechaPrestamo(java.time.LocalDate.now()); 
                prestamo.setFechaDevolucion(java.time.LocalDate.now().plusDays(32));
                System.out.println("\t\tPrestamo {"
                        + "idPrestamo: " + prestamo.getIdPrestamo() +", "
                        + "Ejemplar: " + prestamo.getEjemplar().toString() +", "
                        + "Lector: " +   prestamo.getLector().toString()   +", "
                        + "fechaPrestamo: "+ prestamo.getFechaPrestamo().toString() +", "
                        + "fechaDevolucion: "+ prestamo.getFechaDevolucion().toString() +""
                        + "}.");
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc=" Multa ">
                System.out.println("\tEntidad de Multa: ");
                multa.setId_multa(1);
                multa.setPrestamo(prestamo);
                multa.setFecha_inicio(java.time.LocalDate.now());
                multa.setFecha_fin(java.time.LocalDate.now().plusDays(4));
                System.out.println("\t\tMulta {"
                        + "idMulta: "+ multa.getId_multa() + ", "
                        + "Prestamo: "+ multa.getPrestamo().toString() + ", "
                        + "Fecha inicio: "+ multa.getFecha_inicio().toString() + ", "
                        + "Fecha final: "+ multa.getFecha_fin().toString() +""
                        + "}.");
                // </editor-fold>

                System.out.println("FIN Prueba Entidades\n");//.....................FIN Probar las Entidades
            }else System.out.println("Sin prueba de Entidades...");
            
            if(argumentos.length > 2 && argumentos[2].equals("1")){
                
                System.out.println("\nPrueba de Conexion:\n-----------------");//...Probar conexion
                //conectar
                CONEXION.Conectar();
                //es valida?
                if(CONEXION.esValida()) System.out.println("Conexion OK");
                else System.out.println("Conexion ERROR: "+ CONEXION.getExcepcion());
                //fin
                System.out.println("FIN Prueba de Conexion:\n");//..................FIN Probar conexion
                
            }else System.out.println("Sin prueba de Conexion...");
            
            if(argumentos.length > 3 && argumentos[3].equals("1")){
                System.out.println("\tPrueba de Clases Data:\n");//.................Probar Clases Data
                if(CONEXION.esValida()){
                    
                    //Clases data
                    BD.AutorData ad = new BD.AutorData(CONEXION);
                    BD.LectorData led = new BD.LectorData(CONEXION);
                    BD.LibroData lid = new BD.LibroData(CONEXION);
                    BD.EjemplarData ed = new BD.EjemplarData(CONEXION);
                    BD.PrestamoData pd = new BD.PrestamoData(CONEXION);
                    BD.MultaData md = new BD.MultaData(CONEXION);
                    
                    //Clases entidades para pruebas
                    Entidades.Autor aPrueba = new Entidades.Autor("55.888.444", "Autor de grandes mitos", "Argentina", java.time.LocalDate.of(1985, 12, 25)); aPrueba.setIdAutor(1);
                    Entidades.Lector lePrueba = new Entidades.Lector("111", "Lector lento", "No posee", "Direccion actual", java.time.LocalDate.of(1911, 4, 20));
                    Entidades.Libro liPrueba = new Entidades.Libro(999L, "Un libro de risa", "Humor", "Chistin", (short)2020, aPrueba, 1, 1);
                    Entidades.Ejemplar ePrueba = new Entidades.Ejemplar(1, 3, liPrueba);
                    Entidades.Prestamo pPrueba = new Entidades.Prestamo(1, ePrueba, lePrueba, java.time.LocalDate.of(2021, 6, 1), java.time.LocalDate.now());
                    Entidades.Multa mPrueba = new Entidades.Multa(1, pPrueba, java.time.LocalDate.now(), java.time.LocalDate.now().plusDays(6));
                    
                    //Listas de pruebas
                    java.util.List<Entidades.Autor> aLista;
                    java.util.List<Entidades.Lector> leLista;
                    java.util.List<Entidades.Libro> liLista;
                    java.util.List<Entidades.Ejemplar> eLista;
                    java.util.List<Entidades.Prestamo> pLista;
                    java.util.List<Entidades.Multa> mLista;
                    
                    //Pruebas de clases data...
                    //<editor-fold defaultstate="collapsed" desc=" AutorData ">
                    System.out.println("\t\tPrueba de AutorData:\n");
                    //..................................................................Probar guardar(Autor);
                    aPrueba.setIdAutor(ad.guardar(aPrueba));
                    if(aPrueba.getIdAutor() > 0){
                        System.out.println("\t\tExito al guardar un Autor.");
                    }else{
                        System.out.println("\t\tERROR al guardar un Autor.");
                    }

                    //..................................................................Probar modificar(Autor);
                    aPrueba.setNombre("SOS");
                    aPrueba.setFechaNacimiento(java.time.LocalDate.now());
                    if(ad.modificar(aPrueba) == 1){
                        System.out.println("\t\tExito al modificar un Autor.");
                    }else{
                        System.out.println("\t\tERROR al modificar un Autor.");
                    }

                    //..................................................................Probar desactivar(idAutor);
                    if(ad.desactivar(aPrueba.getIdAutor()) == 1){
                        System.out.println("\t\tExito al desactivar un Autor.");
                    }else{
                        System.out.println("\t\tExito al desactivar un Autor.");
                    }

                    //..................................................................Probar activar(idAutor);
                    if(ad.activar(aPrueba.getIdAutor()) == 1){
                        System.out.println("\t\tExito al activar un Autor.");
                    }else{
                        System.out.println("\t\tExito al activar un Autor.");
                    }

                    //..................................................................Probar buscarAutor(Autor);
                    aPrueba = ad.buscarAutor("55.888.444");
                    if(aPrueba != null){
                        System.out.println("\t\tExito al buscar un Autor.\n" 
                                + aPrueba.toString());
                    }else{
                        System.out.println("\t\tERROR al buscar un Autor.");
                    }

                    //..................................................................Probar obtenerAutores();
                    aLista = ad.obtenerAutores();
                    if(aLista.size() > 0){
                        System.out.println("\t\tExito al obtener Autores:\n" 
                                + java.util.Arrays.toString(aLista.toArray()));
                    }else{
                        System.out.println("\t\tERROR al obtener listado de Autores.");
                    }

                    System.out.println("\t\tFIN Prueba de AutorData:\n");
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" LectorData ">
                    System.out.println("\t\tPrueba de LectorData:\n");

                    //..................................................................Probar guardar(Lector);
                    lePrueba.setIdLector(led.guardar(lePrueba));
                    if(lePrueba.getIdLector() > 0){
                        System.out.println("\t\tExito al guardar un Lector.");
                    }else{
                        System.out.println("\t\tERROR al guardar un Lector.");
                    }

                    //..................................................................Probar modificar(Lector);
                    lePrueba.setTelefono("911");lePrueba.setDireccion("Su casa");
                    if(led.modificar(lePrueba) == 1){
                        System.out.println("\t\tExito al modificar un Lector.");
                    }else{
                        System.out.println("\t\tERROR al modificar un Lector.");
                    }

                    //..................................................................Probar desactivar(idLector);
                    if(led.desactivar(lePrueba.getIdLector()) == 1){
                        System.out.println("\t\tExito al desactivar un Lector.");
                    }else{
                        System.out.println("\t\tExito al desactivar un Lector.");
                    }

                    //..................................................................Probar activar(idLector);
                    if(led.activar(lePrueba.getIdLector()) == 1){
                        System.out.println("\t\tExito al activar un Lector.");
                    }else{
                        System.out.println("\t\tExito al activar un Lector.");
                    }

                    //..................................................................Probar buscarLector(Lector);
                    lePrueba = led.buscarLector("55.888.444");
                    if(lePrueba != null){
                        System.out.println("\t\tExito al buscar un Lector.\n" 
                                + lePrueba.toString());
                    }else{
                        System.out.println("\t\tERROR al buscar un Lector.");
                    }

                    //..................................................................Probar obtenerLectores();
                    leLista = led.obtenerLectores();
                    if(leLista.size() > 0){
                        System.out.println("\t\tExito al listar Lectores.\n" 
                                + java.util.Arrays.toString(leLista.toArray()));
                    }else{
                        System.out.println("\t\tERROR al listar Lectores.");
                    }

                    System.out.println("\t\tFIN Prueba de LectorData:\n");
                    //</editor-fold>
                    
                    //<editor-fold defaultstate="collapsed" desc=" LibroData ">
                    System.out.println("\t\tPrueba de LibroData:\n");

                    //..................................................................Probar guardar(Libro);
                    liPrueba.setId(lid.guardar(liPrueba));
                    if(liPrueba.getId() > 0){
                        System.out.println("\t\tExito al guardar un Libro.");
                    }else{
                        System.out.println("\t\tERROR al guardar un Libro.");
                    }

                    //..................................................................Probar modificar(Libro);
                    liPrueba.setEditorial("Mucho miedo");liPrueba.setNombre("El hombre de la bolsa");liPrueba.setTipo("Infantiles");
                    if(lid.modificar(liPrueba) == 1){
                        System.out.println("\t\tExito al modificar un Libro.");
                    }else{
                        System.out.println("\t\tERROR al modificar un Libro.");
                    }

//                    //..................................................................Probar desactivar(idLibro);
//                    if(lid.desactivar(liPrueba.getIdLector()) == 1){
//                        System.out.println("\t\tExito al desactivar un Libro.");
//                    }else{
//                        System.out.println("\t\tExito al desactivar un Libro.");
//                    }
//
//                    //..................................................................Probar activar(idLibro);
//                    if(lid.activar(lePrueba.getIdLector()) == 1){
//                        System.out.println("\t\tExito al activar un Libro.");
//                    }else{
//                        System.out.println("\t\tExito al activar un Libro.");
//                    }

                    //..................................................................Probar buscarLibro(idLibro);
                    liPrueba = lid.buscarLibro(999L);
                    if(liPrueba != null){
                        System.out.println("\t\tExito al buscar un Libro.\n" 
                                + liPrueba.toString());
                    }else{
                        System.out.println("\t\tERROR al buscar un Libro.");
                    }

                    //..................................................................Probar obtenerLibros();
                    liLista = lid.obtenerLibros();
                    if(liLista.size() > 0){
                        System.out.println("\t\tExito al listar Libros.\n" 
                                + java.util.Arrays.toString(liLista.toArray()));
                    }else{
                        System.out.println("\t\tERROR al listar Libros.");
                    }

                    System.out.println("\t\tFIN Prueba de LibroData:\n");
                    //</editor-fold>
                    
                    //<editor-fold defaultstate="collapsed" desc=" EjemplarData ">
                    System.out.println("\t\tPrueba de EjemplarData:\n");

                    //..................................................................Probar guardar(Ejemplar);
                    ePrueba.setId(ed.guardar(ePrueba));
                    if(ePrueba.getId() > 0){
                        System.out.println("\t\tExito al guardar un Ejemplar.");
                    }else{
                        System.out.println("\t\tERROR al guardar un Ejemplar.");
                    }

                    //..................................................................Probar modificar(Ejemplar);
                    Entidades.Libro liPrueba2 = liPrueba;
                    liPrueba2.setNombre("Un libro poco leido");
                    ePrueba.setLibro(liPrueba2);
                    if(ed.modificar(ePrueba) == 1){
                        System.out.println("\t\tExito al modificar un Ejemplar.");
                    }else{
                        System.out.println("\t\tERROR al modificar un Ejemplar.");
                    }

                    //..................................................................Probar buscarEjemplar(idEjemplar);
                    ePrueba = ed.buscarEjemplar(1);
                    if(ePrueba != null){
                        System.out.println("\t\tExito al buscar un Ejemplar.\n" 
                                + ePrueba.toString());
                    }else{
                        System.out.println("\t\tERROR al buscar un Ejemplar.");
                    }

                    //..................................................................Probar obtenerEjemplares();
                    eLista = ed.obtenerEjemplares();
                    if(eLista.size() > 0){
                        System.out.println("\t\tExito al listar Ejemplares.\n" 
                                + java.util.Arrays.toString(eLista.toArray()));
                    }else{
                        System.out.println("\t\tERROR al listar Ejemplares.");
                    }

                    System.out.println("\t\tFIN Prueba de EjemplarData:\n");
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" PrestamoData ">
                    System.out.println("\t\tPrueba de PrestamoData:\n");

                    //..................................................................Prueba registrar(Prestamo);
                    pPrueba.setIdPrestamo(pd.registrar(pPrueba));
                    if(pPrueba.getIdPrestamo() > 0){
                        System.out.println("\t\tExito al Registrar Prestamo.");
                    }else{
                        System.out.println("\t\tERROR al Registrar Prestamo.");
                    }

                    //..................................................................Prueba modificar(Prestamo);
                    Entidades.Ejemplar ePrueba2 = ePrueba;
                    pPrueba.setEjemplar(ePrueba2);
                    if(pd.modificar(pPrueba) == 1){
                        System.out.println("\t\tExito al Modificar Prestamo.");
                    }else{
                        System.out.println("\t\tERROR al Modificar Prestamo.");
                    }

                    //..................................................................Prueba anular(Prestamo);
                    if(pd.anular(pPrueba) == 1){
                        System.out.println("\t\tExito al Anular Prestamo.");
                    }else{
                        System.out.println("\t\tERROR al Anular Prestamo.");
                    }

                    //..................................................................Prueba devolver(Prestamo);
                    if(pd.devolver(pPrueba) == 1){
                        System.out.println("\t\tExito al Devolver un Prestamo.");
                    }else{
                        System.out.println("\t\tERROR al Devolver un Prestamo.");
                    }

                    //..................................................................Prueba listar(fecha);
                    pLista = pd.listar(java.time.LocalDate.now());
                    if(pLista.size() > 0){
                        System.out.println(java.util.Arrays.toString(pLista.toArray()));
                        System.out.println("\t\tExito al Listar Prestamos por Fecha.");
                    }else{
                        System.out.println("\t\tERROR al Listar Prestamos por Fecha. O no hay Prestamos en esa fecha.");
                    }

                    //..................................................................Prueba listar(Lector);
                    pLista = pd.listar(lePrueba);
                    if(pLista.size() > 0){
                        System.out.println(java.util.Arrays.deepToString(pLista.toArray()));
                        System.out.println("\t\tExito al Listar por Lector.");
                    }else{
                        System.out.println("\t\tERROR al Listar por Lector. O ese Lector no tiene prestamo.");
                    }
                    
                    //..................................................................Prueba listarVencidos();
                    leLista = pd.listarVencidos();
                    if(leLista.size() > 0){
                        System.out.println(java.util.Arrays.deepToString(leLista.toArray()));
                        System.out.println("\t\tExito al Listar Prestamos Vencidos.");
                    }else{
                        System.out.println("\t\tERROR al Listar Prestamos Vencidos. O no hay Prestamos Vencidos.");
                    }
                    System.out.println("\t\tFIN Prueba de PrestamoData:\n");
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" MultaData ">
                    //..................................................................Prueba guardar(Multa)
                    mPrueba.setId_multa(md.guardar(mPrueba));
                    if(mPrueba.getId_multa() > 0){
                        System.out.println("\t\tExito al Registrar Multa.");
                    }else{
                        System.out.println("\t\tERROR al Registrar Multa.");
                    }
                    
                    //..................................................................Prueba modificar(Multa)
                    Entidades.Prestamo pPrueba2 = pPrueba;
                    mPrueba.setPrestamo(pPrueba2);
                    if(md.modificar(mPrueba) == 1){
                        System.out.println("\t\tExito al Modificar Multa.");
                    }else{
                        System.out.println("\t\tERROR al Modificar Multa.");
                    }
                    
                    //..................................................................Prueba borrarMulta(Multa)
                    md.borrarMulta(1);
                    System.out.println("Multa con id 1 eliminada.");
                    
                    //..................................................................Prueba buscarMulta(Prestamo)
                    mPrueba = md.buscarMulta(pPrueba);
                    if(mPrueba != null){
                        System.out.println("\t\tExito al buscar Multa.");
                    }else{
                        System.out.println("\t\tERROR al buscar Multa.");
                    }
                    
                    //..................................................................Prueba obtenerMultas()
                    mLista = md.obtenerMultas();
                    if(mLista.size() > 0){
                        System.out.println(java.util.Arrays.deepToString(mLista.toArray()));
                        System.out.println("\t\tExito al Listar Multas.");
                    }else{
                        System.out.println("\t\tERROR al Listar Multas.");
                    }
                    System.out.println("\t\tFIN Prueba de MultaData:\n");
                    
                    //</editor-fold>

                }else{
                    System.out.println("Error en la Conexion: "+ CONEXION.getExcepcion());
                }
                System.out.println("\tFIN Prueba de Clases Data\n");//..............FIN Probar Clases Data
            }else System.out.println("Sin prueba de Clases Data...");
        }else System.out.println("Ejecutar sin pruebas...");
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc=" GUI ">
        if(args.length > 1 && args[1].equals("GUI")){
            // Pre-Inicio de GUI
            System.out.println("Cargando GUI");
            if(!CONEXION.esValida()) CONEXION.Conectar();
            
            System.out.println("GUI Principal con menu");
            GUI.Principal.iniciar();//..............................................GUI
        }
        // </editor-fold>
        
    }
    
}
