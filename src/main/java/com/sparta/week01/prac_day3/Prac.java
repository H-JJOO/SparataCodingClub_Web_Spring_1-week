package com.sparta.week01.prac_day3;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static String menus(String dish) {
        List<String> menu = new ArrayList<>();
        menu.add("한식");
        menu.add("중식");
        menu.add("일식");
        menu.add("양식");

        String introduce = "";

        for (int i = 0; i < menu.size(); i++) {
            String c = menu.get(i);
            if (c == dish) {
                System.out.println(c + "먹자");
            }
        }
        return introduce;
    }

    public static void main(String[] args) {


        double ran = (Math.random() * 4) + 1;
        int ranNum = (int) ran;
        System.out.println(ranNum);

        if (ranNum == 1) {
            String korea = menus("한식");

        } else if (ranNum == 2) {
            String japan = menus("일식");

        } else if (ranNum == 3) {
            String china = menus("중식");

        } else {
            String america = menus("양식");
        }


    }
}