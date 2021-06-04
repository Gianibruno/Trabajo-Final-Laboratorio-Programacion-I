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
    private int 
            idPrestamo,         //no modificable
            idEjemplar,         //no nulo
            idLector;           //no nulo
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
        idEjemplar = 0;
        idLector = 0;
        prestamo = java.time.LocalDate.now();
        devolucion = null;
    }
    /**
     * Nueva entidad Prestamo sin fecha de devolucion
     * @param idPrestamo
     * @param idEjemplar
     * @param idLector
     * @param entrega 
     */
    public Prestamo(
            int idPrestamo, 
            int idEjemplar, 
            int idLector, 
            java.time.LocalDate prestamo
    ) {
        this.idPrestamo = idPrestamo;
        this.idEjemplar = idEjemplar;
        this.idLector = idLector;
        this.prestamo = prestamo;
        devolucion = null;
    }
    /**
     * Nueva entidad Prestamo con todos los datos
     * @param idPrestamo
     * @param idEjemplar
     * @param idLector
     * @param entrega
     * @param devolucion 
     */
    public Prestamo(
            int idPrestamo, 
            int idEjemplar, 
            int idLector, 
            java.time.LocalDate prestamo, 
            java.time.LocalDate devolucion) {
        this.idPrestamo = idPrestamo;
        this.idEjemplar = idEjemplar;
        this.idLector = idLector;
        this.prestamo = prestamo;
        this.devolucion = devolucion;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Getters ">
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public int getIdLector() {
        return idLector;
    }

    public java.time.LocalDate getFechaPrestamo() {
        return prestamo;
    }

    public java.time.LocalDate getFechaDevolucion() {
        return devolucion;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Setters ">
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public void setFechaPrestamo(java.time.LocalDate prestamo) {
        this.prestamo = prestamo;
    }

    public void setFechaDevolucion(java.time.LocalDate devolucion) {
        this.devolucion = devolucion;
    }
    //</editor-fold>
}
