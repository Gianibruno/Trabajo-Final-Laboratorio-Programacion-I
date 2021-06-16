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

    }
    
    public Multa (Lector unLector, Ejemplar unLibro) { //Los métodos estáticos no sirven.
        this.lector = unLector;
        this.libro = unLibro;
    }
}
