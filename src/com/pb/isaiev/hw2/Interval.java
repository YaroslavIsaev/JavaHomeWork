package com.pb.isaiev.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Введите число: ");
        number = scan.nextInt();

        if ( number <= 14 && number >=  0)
        {System.out.print("Число находится в промежутке [0 - 14]");}

        else if ( number <= 35 && number >=  15)
        {System.out.print("Число находится в промежутке [15 - 35]");}

        else if ( number <= 50 && number >=  36)
        {System.out.print("Число находится в промежутке [36 - 50]");}

        else if ( number <= 100 && number >=  51)
        {System.out.print("Число находится в промежутке [51 - 100]");}

        else if ( number < 0 || number > 100)
        {System.out.print("Число не находится в промежутке [0 - 100]");}
    }
}
