package com.sparta.week01.prac_day4;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static String gugudan() {

        String gugudan = "";

        for (int i = 2; i < 10; i++) {
            System.out.println("===============");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }

        return gugudan;
    }

    public static void main(String[] args) {

        gugudan();


    }
}