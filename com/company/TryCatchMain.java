package com.company;

public class TryCatchMain {

    public static void main(String[] args) {
    //El try es una excepción para que el código se siga ejecutando si en llegado caso tiene un error, por ejemplo




    /*int result = 5 / 0 ;//Esto por sí solo reprensenta un error

        System.out.println(result);//Por lo tanto esta línea de código no se ejecuta. Pero con el try si*/

        //Entonces

        try {

            int result = 5 / 5; //Si aquí está el error, ingresa la excepción al catch, si no hay error sigue
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally { //Se ejecuta si o si
            System.out.println("Cierre de Recursos");
        }

        System.out.println("Fin");

       //Con el try el código sigue hast el final
    }
}
