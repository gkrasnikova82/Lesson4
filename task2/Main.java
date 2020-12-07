package com.task2;

public class Main {

    public static void main(String[] args) {
    //Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.


            int x = 5;
        System.out.println("Задаяа 2.Характеристика введенного числа: "+x) ;
        System.out.print("Ответ: ") ;
	if (x<0)
            System.out.print("отрицательное число "+x);
	else {if (x>0) System.out.print("положительное число "+x);
    else System.out.print("Нулевое "+x);}
    if ((x % 2) == 0)
            System.out.println(", четное.");
			 else System.out.println(", не четное.");

}
}