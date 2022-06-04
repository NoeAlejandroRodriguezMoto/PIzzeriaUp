package com.up.chiapas.Pizzeria1;

import com.up.chiapas.Pizzeria1.models.Pedido;
import com.up.chiapas.Pizzeria1.models.Pizza;
import com.up.chiapas.Pizzeria1.models.Tienda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---------------------------------------");
            System.out.println("Bienvenido a la pizzeria UP");
            System.out.println("▒▒▒▒▒▒▐███████▌▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒▐░▀░▀░▀░▌▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒▐▄▄▄▄▄▄▄▌▒▒▒▒▒▒▒\n" +
                    "▄▀▀▀█▒▐░▀▀▄▀▀░▌▒█▀▀▀▄▒\n" +
                    "▌▌▌▌▐▒▄▌░▄▄▄░▐▄▒▌▐▐▐▐▒\n" +
                    "\n" +
                    "★★★★★★★★★★★★★★★★★★\n" +
                    "★ PIZZERIA UP ★\n" +
                    "★★★★★★★★★★★★★★★★★★");
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Ordenar ");
            System.out.println("2. Salir ");
            System.out.println("---------------------------------------");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ordenar();
                    break;
                case 2:
                    System.out.println("Nos vemos");
                    break;
                default:
                    System.out.println("Intenta de nuevo");
            }
        }while (opcion !=2);

    }
    public static void Ordenar(){
        String nombre;
        byte opcion;
        Pedido pedido1;
        Pizza pizza1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("▓▓▓░░▄██▀░█░█░▀██▄░░▓▓\n" +
                "▓▓░▄███▄░▄███▄░▄███▄░▓\n" +
                "▓░░█████████████████░░\n" +
                "▓▓░▀████▀▀███▀▀████▀░▓\n" +
                "▓▓▓░░▀███▄░█░▄███▀░░▓▓\n" +
                "\n" +
                "♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦\n" +
                "♦ INGRESE SU NOMBRE: ♦\n" +
                "♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        nombre = teclado.nextLine();
        System.out.println("███▀▀▀▀███████████████\n" +
                "██░░░░░▄██████████████\n" +
                "█▌░░░░████░░██░░██░░██\n" +
                "██░░░░░▀██████████████\n" +
                "███▄▄▄▄███████████████\n" +
                "" +
                "☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n" +
                "☆ ELIJA LA PIZZA QUE " +
                " DESEA ORDENAR ☆\n" +
                "☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
        System.out.println("1. Hawayana  $139 pesos");
        System.out.println("2. Peperoni  $89 pesos");
        System.out.println("3. Mexicana  $149 pesos");
        System.out.println("4. Champiñones  $109 pesos");
        System.out.println("--------------------------------------");
        opcion = teclado.nextByte();
        Tienda tienda = new Tienda((byte) (opcion-1),nombre);

        pedido1 = tienda.SendPedido();
        pizza1 = pedido1.SendPizza();
        System.out.println("░░░░░▄░░░░░░█▄█░░░░░░\n" +
                "░░░▄▀░░░░░▄▄██▀░░░░░░\n" +
                "░░░▀▄░░▄██████░░░░░░░\n" +
                "▒░▒░▀▄████▀█▀█▒░▒░▒▒░\n" +
                "░▒░▒░▒▀██▄▒█▒█░▒░▒░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░\n" +
                "░ DATOS DE LA ORDEN ░\n" +
                "░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Cliente: " + pedido1.getCliente().getNombrecliente());
        System.out.println("Precio: " + "$" + pizza1.getPrecio() + " "+ "pesos");
        System.out.println("Ingrediente de la pizza: " + pizza1.getNombre());


    }
}
