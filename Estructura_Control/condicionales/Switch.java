package Estructura_Control.condicionales;

public class Switch {

    public static void main(String[] args) {

        //No se recomienda mucho su uso, con el if else if se puede hacer

        String dia = "Miercoles";

        switch (dia) {
            case "Lunes":
            System.out.println("Empecemos la semana");
            break; //Es para romper el caso de ejecución
            case "Martes":
                System.out.println("Ni te cases ni te embarques");
                break; //Es para romper el caso de ejecución
            case "Miercoles":
                System.out.println("Ombligoooooo");
                break; //Es para romper el caso de ejecución
            case "Jueves":
                System.out.println("Jueeeeeeeernes");
                break; //Es para romper el caso de ejecución
            case "Viernes":
                System.out.println("Hasta hoy trabajoooo");
                break; //Es para romper el caso de ejecución
            default:
                System.out.println("Fin de semana, NO MOLESTAR");

        }
    }
}
