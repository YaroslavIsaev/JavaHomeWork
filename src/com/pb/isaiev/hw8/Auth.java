package com.pb.isaiev.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        checkLogin(login);
        checkPassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    private void checkLogin(String login) throws WrongLoginException {
        if (login.length() < 5) {
            throw new WrongLoginException("Логин должен содержать больше 5 символов.");
        } else if (login.length() > 20) throw new WrongLoginException("Логин должен содержать меньше 20 символов.");
        else if (!login.matches("[a-zA-Z0-9]*"))
            throw new WrongLoginException("В логине должны быть только латинские буквы или цифры!");
    }

    private void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if(password.length() < 5) {
            throw new WrongPasswordException("Пароль должен содержать больше 5 символов!");
        } else if (!password.matches("[_a-zA-Z0-9]*")) {
            throw new WrongPasswordException("В пароле должны быть только латинские буквы/цифры или подчеркивание!");
        } else if (!password.equals(confirmPassword)) throw new WrongPasswordException("Пароль указан неверно!");
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (!this.login.equals(login) || !this.password.equals(password))
            throw new WrongLoginException("Не верно указан логин/пароль.");
    }
}
