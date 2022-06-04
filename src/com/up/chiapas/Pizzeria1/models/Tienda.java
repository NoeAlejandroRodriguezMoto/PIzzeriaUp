package com.up.chiapas.Pizzeria1.models;

public class Tienda {
    Pedido pedido;
    byte opcion;
    String nombre;
    Cliente cliente;
    public Tienda(byte opcion, String nombreC) {
        this.opcion = opcion;
        this.nombre = nombreC;
    }
    public Pedido SendPedido(){
        return pedido = new Pedido(cliente = new Cliente(nombre),opcion);
    }
}
