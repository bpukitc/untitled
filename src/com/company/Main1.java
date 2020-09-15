package com.company;


import java.util.Scanner;

public class Main1 {

    public static String enterText() {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        return x;
    }

    public static String[] arrayCreate() {
        String[] array = enterText().split(" ");
        return array;
    }

    public static String[] finalResult() {
        int n = arrayCreate().length;

        String temp;

        for (int i = 0; i < n / 2; i++) {

            temp = arrayCreate()[n - i - 1];
            arrayCreate()[n - i - 1] = arrayCreate()[i];
            arrayCreate()[i] = temp;
        }return arrayCreate();
    }

        public static void main (String[]args){

        System.out.println("Ввести в консоль текст \"Привет меня зовут Максим\"");
        enterText();
        arrayCreate();
        finalResult();
    }


    }



//Написать программу, в которой пользователю предлагается
// ввести в консоль текст "Привет меня зовут Максим".

// Далее создать массив и записать каждое слово в отдельный элемент массива.
// Вывести в консоль строку из элементов массива в обратном
// порядке используя формулу n-i-1.

//Каждое действие должно выполняться в отдельном методе!
// Т.е. В методе main только вызов пользовательских методов!