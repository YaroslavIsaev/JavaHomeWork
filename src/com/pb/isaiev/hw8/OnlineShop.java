package com.pb.isaiev.hw8;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Auth auth = new Auth();
        String login, password, confirmPassword;
        boolean signedUp = false, signedIn = false;

        System.out.println("Для регистрации на сайте укажите логин: ");
        login = scan.next();
        System.out.println("Введите Ваш пароль:");
        password = scan.next();
        System.out.println("Повторите еще раз Ваш пароль: ");
        confirmPassword = scan.next();

        while (!signedUp) {
            try {
                auth.signUp(login, password, confirmPassword);
                signedUp = true;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                System.out.println("Для регистрации введите логин: ");
                login = scan.next();
            } catch (WrongPasswordException e) {
                System.out.println("Введите Ваш пароль: ");
                password = scan.next();
                System.out.println("Повторите еще раз Ваш пароль: ");
                confirmPassword = scan.next();
            }
        }

        System.out.println("Поздравляем! Вы успешно зарегистрировались! ");

        while (!signedIn) {
            System.out.println("Для входа на сайт введите Ваш логин: ");
            login = scan.next();
            System.out.println("Введите Ваш пароль: ");
            password = scan.next();
            try {
                auth.signIn(login, password);
                signedIn = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Вы успешно зашли на сайт.");


    }
}
