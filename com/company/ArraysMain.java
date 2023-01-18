package com.company;

public class ArraysMain {

    public static void main(String[] args) {

        //Los ARRAYS SON ESTÁTICOS

        String nombre1 = "Jhonatan";
        String nombre2 = "Catalina   ";
        String nombre3 = "Isabella";
        String nombre4 = "Carmen";

        String[] nombres = new String[4]; //Este es un array y va a estar fijo, es solo un ejemplo
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3, nombre4}; //Otra forma de declarar un array

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;

     //Para imprimir todos los nombres, hacemos un bucle for que recorra el metodo

        for (int i = 0; i < nombres.length; i++){

            System.out.println(nombres[i]);
        }


    }
}
