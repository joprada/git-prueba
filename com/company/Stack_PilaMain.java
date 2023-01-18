package com.company;

import java.util.Stack;

public class Stack_PilaMain {

    public static void main(String[] args) {


        Stack<String> pila = new Stack<String>();

        pila.push("Matemáticas");
        pila.push("Español");
        pila.push("Sociales");

        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}
