package com.pb.isaiev.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String s1, s2;
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите 1-ю строку: ");
        s1 = scan.nextLine();
        System.out.println("Введите 2-ю строку: ");
        s2 = scan.nextLine();
        char[] Arr1 = s1.toLowerCase().toCharArray();
        char[] Arr2 = s2.toLowerCase().toCharArray();
        String valueOfchar1 = getSortedString(Arr1);
        String valueOfchar2 = getSortedString(Arr2);
        printResult(valueOfchar1, valueOfchar2);
    }
    private static String getSortedString(char[] words) {
        Arrays.sort(words);
        return String.valueOf(words).replaceAll("[, ;.!?/-:]", "");
    }
    private static void printResult(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("Строки - анаграмма");
        } else {
            System.out.println("Строки - не анаграмма");
        }
    }
}
