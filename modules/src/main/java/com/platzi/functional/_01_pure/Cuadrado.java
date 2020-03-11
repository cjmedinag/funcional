package com.platzi.functional._01_pure;

import java.util.function.Function;

public class Cuadrado {
    public static void main(String[] args) {

        Function<Integer, Integer> cuadrado = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(cuadrado.apply(5));;
    }
}
