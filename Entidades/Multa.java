/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Entidades
 */
package Entidades;

/**
 * Clase Entidad: Multa
 * 
 */
public class Multa {
    private Lector lector;
    private Ejemplar libro;
    
    public void aplicarMulta () {
        lector.setDeuda(lector.getDeuda()+2);
    }
    
    public Multa (Lector unLector, Ejemplar unLibro) { //Los métodos estáticos no sirven.
        this.lector = unLector;
        this.libro = unLibro;
    }
}
