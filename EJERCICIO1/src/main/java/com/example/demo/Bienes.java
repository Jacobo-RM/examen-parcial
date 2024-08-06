package com.example.demo;

public class Bienes {
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;
    private boolean conPuerta;
    public Bienes(int id, String nombre, double precio, String descripcion, boolean conPuerta) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.conPuerta = conPuerta;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isConPuerta() {
        return conPuerta;
    }
    public void setConPuerta(boolean conPuerta) {
        this.conPuerta = conPuerta;
    }

    
}
