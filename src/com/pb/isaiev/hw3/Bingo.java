package com.pb.isaiev.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int number, generator, attempt = 0;
        Random random = new Random();
        generator = random.nextInt(101);
        Scanner scan = new Scanner(System.in);
        System.out.println("Давай сыграем в игру! Я загадал число от 0 до 100. Угадай!");
        System.out.println("Чтоб закончить игру введите Отрицательное число");

        do {
            attempt++;
            System.out.println("Введите число: ");
            number = scan.nextInt();

            if(number<0) { System.out.println("Пока неудачник!");  break;}

            if (number<generator) System.out.println("Мое число - Больше!");
            else if (number>generator) System.out.println("Мое число - Меньше!");
            else System.out.println("Бинго, Вы угадали с " + attempt + " попытки!");
        }
        while (generator != number);
        System.out.println("Конец игры!");
    }
}
