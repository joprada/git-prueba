package com.company;


import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("91541897", "Jhonatan Prada");
        personas.put("91541898", "Jhonatan2 Prada");
        personas.put("91541899", "Jhonatan3 Prada");

        System.out.println(personas);

        for (String value : personas.values()) {
            System.out.println(value);
        } //Este bucle recorre los nombres

        for (String key : personas.keySet()) {
            System.out.println(key);
        }//Este bucle por la palabra clave keySet nos trae el primer valor del mapa

        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }//ESte bucle nos trae los dos valores, se definen en este caso los dos son String y se obitnenes los valores

//Estas son las 3 formas de obtener valores de los mapas con bucles foreach
     }




    }





