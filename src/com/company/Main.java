package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите имя: ");
        Scanner names1 = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listA.add(names1.nextLine());
        }
        System.out.println(listA);

        for (int i = 0; i < 5; i++) {
            listB.add(names1.nextLine());
        }
        System.out.println(listB);

        Collections.reverse(listB);
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        listC.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(listC);
    }
}
/*
Используйте цикл или итератор
b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
После также отображает его в консоли
e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
и распечатать отсортированный список С.
 */