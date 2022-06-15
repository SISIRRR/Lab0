package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "password";
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль ");
        userInput = scanner.next();

        if (userInput.equals(password)) {
            System.out.println("Вы вошли в систему");
        } else {
            System.out.println("Пароль неверен");
        }
    }
}
