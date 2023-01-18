package Estructura_Control.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Lunes";

        boolean resultado = dia.equals("Miercoles"); //Para comparar textos lo hacemos con .equals, paa comparar número con el ==

        //ejemplos comparar

        // if else if: permite verificar varias condiciones

        if (dia.equals("Lunes")) {

            System.out.println("Empezando la semana con toda la energía");
        } else if (dia.equals("Martes")) {

            System.out.println("Martes de entrenamiento TREN SUPERIOR");
        } else if (dia.equals("Miercoles")) {

            System.out.println("Miercoles de Pierna Stronger");
        } else if (dia.equals("Jueves")) {

            System.out.println("Jueves de destrozar ese PECHO");
        } else if (dia.equals("Viernes")) {

            System.out.println("La pierna del fin de semana");
        } else if (dia.equals("Sabado")) {

            System.out.println("Sábado de Cardio Power");
        } else if (dia.equals("Domingo")) {

            System.out.println("Día sagrado para Dios y familia");
        } else {
            System.out.println("El día para descansar sólo es el domingo");
        }


    }
}
