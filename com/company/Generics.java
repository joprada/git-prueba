package com.company;

public class Generics <T> {

    T ob;

    Generics(T ob) {
        this.ob = ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }
}
