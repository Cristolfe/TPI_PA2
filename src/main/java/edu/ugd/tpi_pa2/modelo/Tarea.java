/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ugd.tpi_pa2.modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
/**
 *
 * @author wowle
 */
public class Tarea {
    private String ubicacion;
    private String nomVoluntario;
    private LocalDate fecha;
    private LocalTime hora;

    public Tarea(String ubicacion, String nomVoluntario, LocalDate fecha, LocalTime hora) {
        this.ubicacion = ubicacion;
        this.nomVoluntario = nomVoluntario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNomVoluntario() {
        return nomVoluntario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNomVoluntario(String nomVoluntario) {
        this.nomVoluntario = nomVoluntario;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    
    
    
}
