/*
 * Laboratorio 1
 * Trabajo Practico Final
 * Biblioteca
 * Entidades
 */
package Entidades;

import java.time.LocalDate;

/**
 * Clase Entidad: Multa
 * 
 */
public class Multa {
  private int id_multa;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Prestamo prestamo;

    public Multa() {
    }

    public Multa(Prestamo prestamo, LocalDate fecha_inicio, LocalDate fecha_fin ) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.prestamo = prestamo;
    }

    public Multa(int id_multa, Prestamo prestamo, LocalDate fecha_inicio, LocalDate fecha_fin) {
        this.id_multa = id_multa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.prestamo = prestamo;
        
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return " Multa del Lector: " + getPrestamo().getLector().getNombre() + " del ejemplar del libro: "+ getPrestamo().getEjemplar().getLibro().getNombre(); 
    }
    
  }
