package com.sparta.week01.prac_day5;

public class Prac {

    public static String gugudan() {

        String gugudan = "";

        for (int i = 1; i < 10; i++) {
            System.out.println("");
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " X " + i + " = " + i * j + "   ");
            }
        }

        return gugudan;
    }

    public static void main(String[] args) {

        gugudan();


    }
}