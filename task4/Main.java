package com.task4;

public class Main {
    public static void main(String[] args) {

        //Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел a_n=a_1+(n-1)d

        System.out.println("Арифметическая прогрессия с параметрами:");

        int n = 30;
        int d = 2;
        int a = 2;

        System.out.println("d- разность прогрессии (шаг) "+d);
        System.out.println("n- количество чисел "+n);
        System.out.println("а- первое число прогрессии "+a);
        System.out.println("Рассчитывается по формуе:a_n=a_1+(n-1)d. Ответ:");


        int i = 1;
        while (i <= n){
            System.out.print(a+(i-1)*d + " ");
            i++;}
    }
}
