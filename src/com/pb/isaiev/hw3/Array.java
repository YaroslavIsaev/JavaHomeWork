package com.pb.isaiev.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив размерностью 10 элементов:");
        int mas[] = new int[10];
        for (int i = 0; i<10; i++) {
            mas[i] = scan.nextInt();
        }
        System.out.println("Заполненый массив: ");
        for (int i=0;i<mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
        System.out.println();

        int sum = 0;
        for (int i=0;i<mas.length;i++);
        for( int num:mas) {
            sum = sum+num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);

        int num = 0;
        for (int i=0 ; i<mas.length; i++){
            if (mas[i]>0 ){
                num++;
            }
        }
        System.out.println("Количество положительных элементов:  "+ num);

        for (int i=0;i<mas.length;i++);
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.print("Сортировка массива от меньшего к большему: ");
        for (int j : mas) {
            System.out.print( j + " "); }

    }
}
