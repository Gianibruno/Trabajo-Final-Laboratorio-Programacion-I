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
        lector.deuda += 2;
    }
}
