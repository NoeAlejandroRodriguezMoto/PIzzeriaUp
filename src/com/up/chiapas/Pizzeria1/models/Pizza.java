package com.up.chiapas.Pizzeria1.models;

public class Pizza {
    private String nombre;
    private int precio;
    public  Pizza(String nombres, int precios){
        this.nombre=nombres;
        this.precio=precios;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
}
