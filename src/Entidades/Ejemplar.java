/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Entidades
 */
package Entidades;

/**
 * Clase Entidad: Ejemplar
 *
 */
public class Ejemplar {

    private int id;
    private int estado;
    private Libro libro;

    public Ejemplar(int id, int estado, Libro libro) {
        this.libro = libro;
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
