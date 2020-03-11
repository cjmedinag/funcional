package com.platzi.functional._01_pure;

import java.util.function.Function;
import java.util.function.Predicate;

public class Cuadrado {
    public static void main(String[] args) {

        Function<Integer, Integer> cuadrado = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(cuadrado.apply(5));
        ;


        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println( isEven.test(4));


        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student xd = new Student(5.0);


        System.out.println(isApproved.test(xd));

    }

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }


}


