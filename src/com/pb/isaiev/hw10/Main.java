package com.pb.isaiev.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> integerNumBox = new NumBox<>(4);
        try {
            integerNumBox.add(10);
            integerNumBox.add(12);
            integerNumBox.add(14);
            integerNumBox.add(16);
        } catch (Exception e) {
            System.err.println("Массив integerNumBox переполнен");
        }
        System.out.println("Размер массива: " + integerNumBox.length());
        System.out.println("Cреднее арифметическое: " + integerNumBox.average());
        System.out.println("Сумма массива: " + integerNumBox.sum());
        System.out.println("Максимальный элемент массива: " + integerNumBox.max());
        NumBox<Float> floatNumBox = new NumBox<>(4);
        try {
            floatNumBox.add(1.2F);
            floatNumBox.add(2.2F);
            floatNumBox.add(3.2F);
            floatNumBox.add(4.2F);
        } catch (Exception e) {
            System.err.println("Массив floatNumBox переполнен");
        }
        System.out.println("Размер массива: " + floatNumBox.length());
        System.out.println("Cреднее арифметическое: : " + floatNumBox.average());
        System.out.println("Сумма массива: " + floatNumBox.sum());
        System.out.println("Максимальный элемент массива: " + floatNumBox.max());
    }
}
