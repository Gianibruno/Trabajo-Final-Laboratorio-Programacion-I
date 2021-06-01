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

    public Autor(long dni, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(dni, nombre, nacionalidad, fechaNacimiento);
    }


}
