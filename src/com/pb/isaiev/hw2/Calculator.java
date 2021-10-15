package com.pb.isaiev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operand1, operand2, result;
        String sing;

        System.out.print("Введите знак +, -, *, / :  ");
        sing = scan.next();

        System.out.print("Введите первое число: ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        operand2 = scan.nextInt();

        switch (sing) {

            case "+": result=operand1+operand2;
                System.out.print(operand1 + "+" + operand2 + " = " + result);
                break;

            case "-": result=operand1-operand2;
                System.out.print(operand1 + "-" + operand2 + " = " + result);
                break;

            case "*": result=operand1*operand2;
                System.out.print(operand1 + "*" + operand2 + " = " + result);
                break;

            case "/": if (operand2!=0)
            {result=operand1/operand2;
                System.out.print(operand1 + "/" + operand2 + " = " + result);}
            else {System.out.print("Что ты делаешь, прекрати");}
                break;

            default:  System.out.print("Ошибка");
                return;
        }
    }
}
