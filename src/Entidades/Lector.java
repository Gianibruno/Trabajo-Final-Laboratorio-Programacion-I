/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Entidades
 */
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase Entidad: Lector
 *
 */
public class Lector extends Persona {

    private ArrayList<Ejemplar> librosPrestados;

    public Lector(long dni, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(dni, nombre, nacionalidad, fechaNacimiento);
        this.librosPrestados = new ArrayList<>();
    }

    
}
