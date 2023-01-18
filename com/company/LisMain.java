package com.company;

import java.util.ArrayList;
import java.util.List;

public class LisMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<String>();

        nombres.add("Jhonatan");
        nombres.add("Orlando");
        nombres.add("Prada");
        nombres.add("Sánchez");
        nombres.add("El Tattan");

        System.out.println(nombres);

        //Para este tipo de litas se recomienda usar el bucle for each

        for(String nombre : nombres){
            System.out.println(nombre);

            System.out.println(nombres.get(1)); //Nos trae el valor de una lista

            System.out.println( "El tamaño de la lista es: " + nombres.size()); //Nos envía el tamaño de la lista
        }
    }
}
