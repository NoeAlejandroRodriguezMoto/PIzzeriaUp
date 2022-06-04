package com.up.chiapas.Pizzeria1.models;

    public class Pedido {
        Cliente cliente;
        CatalogoPizza pizas = new CatalogoPizza();
        byte opcion;
        Pizza pizza1;

        public Pedido(Cliente cliente, byte opcion) {
            this.cliente = cliente;
            this.opcion = opcion;
        }
        public Pizza SendPizza(){
            Pizza pizza1 = pizas.sendPizza((byte) ((byte)opcion));
            return pizza1;
        }
        public Cliente getCliente(){
            return cliente;
        }
    }

