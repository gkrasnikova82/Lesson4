package com.task3;

public class Main {
    public static void main(String[] args) {

        //Написать программу для вывода на экран таблицы умножения.


        System.out.println("Вывести таблицу умножения:");
        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(i+"x"+y+"=" +i * y + " ");
            }
            System.out.println();
        }
    }
}
