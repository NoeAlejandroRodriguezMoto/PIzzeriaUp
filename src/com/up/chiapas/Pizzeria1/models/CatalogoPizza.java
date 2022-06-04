package com.up.chiapas.Pizzeria1.models;

public class CatalogoPizza {
    Pizza pizza1 = new Pizza("Hawayana",139);
    Pizza pizza2 = new Pizza("Peperoni",89);
    Pizza pizza3 = new Pizza("Mexicana",149);
    Pizza pizza4 = new Pizza("Champiñones", 109);
    Pizza[] pizzas = {pizza1,pizza2,pizza3,pizza4};
    public CatalogoPizza(){
    }
    public Pizza sendPizza(byte i){
        return pizzas[i];
    }
}
