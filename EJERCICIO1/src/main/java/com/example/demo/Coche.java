package com.example.demo;

public class Coche extends Bienes {
    private String marca;
    private String modelo;

    public Coche(int id, String nombre, double precio, String descripcion, boolean conPuerta, String marca, String modelo) {
        super(id, nombre, precio, descripcion, conPuerta);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
