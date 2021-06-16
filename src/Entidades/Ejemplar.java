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

    public Ejemplar() {
        this.id=0;
        this.estado=0;
        this.libro=null;
    }

    public Ejemplar(int id, int estado, Libro libro) {
        this.libro = libro;
        this.id = id;
        this.estado = estado;
    }


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
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

    @Override
    public String toString() {
        return libro.getNombre() + ", " + id;
    }
}
