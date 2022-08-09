package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(100);
            list.add(a);
            if (a %2==1){
                array.add(a);
            } else if (a %2==0) {
                arrayList.add(a);
            }
        }
        System.out.println(list);
        System.out.println("четные - " + arrayList);
        System.out.println("нечетныe" + " - "+array);

        }
    }
