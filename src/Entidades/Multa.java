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

    public Multa() {
    }

    public Multa(LocalDate fecha_inicio, LocalDate fecha_fin) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Multa(int id_multa, LocalDate fecha_inicio, LocalDate fecha_fin) {
        this.id_multa = id_multa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
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
    
    
    
   

}
