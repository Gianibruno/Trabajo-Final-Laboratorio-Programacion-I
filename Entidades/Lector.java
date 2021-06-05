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
    private int deuda;
    private int idLector,
            estado;
    private String telefono,
            direccion;

    public Lector() {
        super("", "", "", null);
        telefono = "";
        direccion = "";
        estado = 1;
        librosPrestados = new ArrayList<>();
    }

    public Lector(String dni, String nombre, LocalDate fechaNacimiento) {
        super(dni, nombre, "", fechaNacimiento);
        telefono = "";
        direccion = "";
        estado = 1;
        librosPrestados = new ArrayList<>();
    }

    public Lector(String dni, String nombre, String telefono, String direccion, LocalDate fechaNacimiento) {
        super(dni, nombre, "", fechaNacimiento);
        this.telefono = telefono;
        this.direccion = direccion;
        estado = 1;
        librosPrestados = new ArrayList<>();
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setLibrosPrestados(ArrayList<Ejemplar> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getIdLector() {
        return idLector;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEstado() {
        return estado;
    }

}
