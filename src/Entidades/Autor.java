/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Entidades
 */
package Entidades;

import java.time.LocalDate;

/**
 * Clase Entidad: Autor
 *
 */
public class Autor extends Persona{
    private int 
            idAutor,
            estado;
    
    public Autor(){
        super("","","",null);
        idAutor = 0;
        estado = 1;
    }
    
    public Autor(String dni, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(dni, nombre, nacionalidad, fechaNacimiento);
        idAutor = 0;
        estado = 1;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    public int getIdAutor() {
        return idAutor;
    }

    public int getEstado() {
        return estado;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
