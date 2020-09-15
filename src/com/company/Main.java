package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        consoleOutput("Введите строку \"Привет меня зовут Максим\"");
        String str = getInputString();
        String[] wordsArr = arrayFromStr(str);
        String[] revertArr = revertArray(wordsArr);
        printArray(revertArr);
    }

    public static void consoleOutput(String str) {
        System.out.println(str);
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        String rawStr = scanner.nextLine();
        return rawStr;
    }

    public static String[] arrayFromStr(String str) {
        String[] words = str.trim().split(" ");
        return words;
    }

    public static String[] revertArray(String[] words) {
        String[] arr = words;
        String temp = null;
        int count = arr.length;
        for (int i = 0; i < count / 2; i++) {
            temp = arr[count - i - 1];
            arr[count - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void printArray(String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
