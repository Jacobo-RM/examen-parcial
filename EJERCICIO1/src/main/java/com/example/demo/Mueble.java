package com.example.demo;

public class Mueble extends Bienes {
    private String material;

    public Mueble(int id, String nombre, double precio, String descripcion, boolean conPuerta, String material) {
        super(id, nombre, precio, descripcion, conPuerta);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
