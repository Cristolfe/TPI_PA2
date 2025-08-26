/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ugd.tpi_pa2.modelo;

/**
 *
 * @author wowle
 */
public class Gato {
    private String nombre;
    private String color;
    private String caracteristicas;
    private String estado_salud;
    private double[] zona = new double[2];
    private int foto;

    public Gato(String nombre, String color, String caracteristicas, String estado_salud, int foto) {
        this.nombre = nombre;
        this.color = color;
        this.caracteristicas = caracteristicas;
        this.estado_salud = estado_salud;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public double[] getZona() {
        return zona;
    }

    public int getFoto() {
        return foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public void setZona(double[] zona) {
        this.zona = zona;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
    
    
    
    
    
    
}
