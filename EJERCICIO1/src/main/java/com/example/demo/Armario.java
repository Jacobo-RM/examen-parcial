package com.example.demo;

public class Armario extends Bienes {
    private int numPuertas;

    public Armario(int id, String nombre, double precio, String descripcion, boolean conPuerta, int numPuertas) {
        super(id, nombre, precio, descripcion, conPuerta);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

}
