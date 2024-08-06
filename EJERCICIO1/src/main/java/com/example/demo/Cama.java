package com.example.demo;

public class Cama extends Bienes {
    private String longitud;

    public Cama(int id, String nombre, double precio, String descripcion, boolean conPuerta, String longitud) {
        super(id, nombre, precio, descripcion, conPuerta);
        this.longitud = longitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

}
