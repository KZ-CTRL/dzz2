package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        String name = point(42, 41);
        System.out.println();

//        System.out.println(point(15,40));
//        System.out.println(point(13,17));
//
//        System.out.println(point(3,10));
//        System.out.println(point(13,10));
//        System.out.println(point(12,10));


    }


    public static String point(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";


        } else if (age < 20 && temp > 0 && temp < 28) {

            return "Можно идти гулять";


        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {

            return "Оставайся дома";

        }


    }


}
