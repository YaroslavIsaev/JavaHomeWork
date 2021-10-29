package com.pb.isaiev.hw4;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        String words;
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите строку: ");
        words = scan.nextLine();
        System.out.println("Результат: " +UP(words));
    }

    public static String UP(String words){
        StringBuilder res;
        char[] result = words.toCharArray();
        if(Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
        res = new StringBuilder("" + result[0]);
        for(int i=1;i<result.length;i++)
        {
            if(Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
            res.append(result[i]);
        }
        return res.toString();
    }
}
