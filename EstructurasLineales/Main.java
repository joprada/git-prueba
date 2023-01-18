package EstructurasLineales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Usuario> pila = new Stack<>();

        Queue<Integer> cola = new LinkedList<Integer>();

        cola.add(2);
        cola.add(1);
        cola.add(3);

        System.out.println("Los elementos de la cola son: " + cola);



    }


}
