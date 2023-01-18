package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class GenericsMain {

    public static void main(String[] args) {


        Generics<Integer> obj = new Generics<>(10);
        Generics<Double> obj2 = new Generics<>(14.8);


        obj.showType();
        obj2.showType();


    }
}
