/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Entidades
 */
package Entidades;

/**
 * Clase Entidad: Prestamo
 * 
 */
public class Prestamo {
    //<editor-fold defaultstate="collapsed" desc=" Atributos ">
    private int idPrestamo;
    Ejemplar ejemplar;
    Lector lector;
    private java.time.LocalDate
            prestamo,            //no nulo
            devolucion;         //nulo
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructores ">
    /**
     * Nueva entidad Prestamo con datos por defecto
     */
    public Prestamo() {
        idPrestamo = 0;
        ejemplar = null;
        lector = null;
        prestamo = java.time.LocalDate.now();
        devolucion = null;
    }
    /**
     * Nueva entidad Prestamo sin fecha de devolucion
     * @param idPrestamo
     * @param ejemplar
     * @param lector
     * @param prestamo 
     */
    public Prestamo(
            int idPrestamo, 
            Ejemplar ejemplar,
            Lector lector,
            java.time.LocalDate prestamo
    ) {
        this.idPrestamo = idPrestamo;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.prestamo = prestamo;
        devolucion = null;
    }
    /**
     * Nueva entidad Prestamo con todos los datos
     * @param idPrestamo
     * @param ejemplar
     * @param lector
     * @param prestamo
     * @param devolucion 
     */
    public Prestamo(
            int idPrestamo, 
            Ejemplar ejemplar,
            Lector lector,
            java.time.LocalDate prestamo, 
            java.time.LocalDate devolucion) {
        this.idPrestamo = idPrestamo;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.prestamo = prestamo;
        this.devolucion = devolucion;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Getters ">
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public java.time.LocalDate getFechaPrestamo() {
        return prestamo;
    }

    public java.time.LocalDate getFechaDevolucion() {
        return devolucion;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Lector getLector() {
        return lector;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Setters ">
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setFechaPrestamo(java.time.LocalDate prestamo) {
        this.prestamo = prestamo;
    }

    public void setFechaDevolucion(java.time.LocalDate devolucion) {
        this.devolucion = devolucion;
    }
    
    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Prestamo del Ejemplar: " + getEjemplar().getId() + " del Libro: " + getEjemplar().getLibro().getNombre() + ", al Lector: "+ getLector().getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
