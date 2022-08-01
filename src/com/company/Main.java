package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Dcoder!");


        List<Boolean> rez = new ArrayList<>();
        rez.add(true);
        rez.add(false);
        rez.add(false);
        rez.add(true);
        rez.add(true);
        rez.add(true);
        rez.add(false);
        rez.add(true);
        rez.add(true);
        rez.add(true);
        rez.add(true);
        rez.add(true);
        rez.add(true);

        int kvo=0;
        int maxkvo=0;
        for(int i=0;i<rez.size();i++) {
            if (rez.get(i)==true) {
                kvo=kvo+1;
            }
            else {
                if (maxkvo<kvo) {
                    maxkvo=kvo;
                }
                kvo=0;
            }
        }


        if (maxkvo<kvo) {
            maxkvo=kvo;
        }

        System.out.println(maxkvo);

    }
}
