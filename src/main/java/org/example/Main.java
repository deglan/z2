package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String token;
        System.out.println(Message.WELCOME.getMessage());
        int chosenLength = scanner.nextInt();

        switch (chosenLength) {
            case 5 -> {
                token = String.valueOf(GenerateToken.generateToken(5));
                System.out.println(Message.TOKEN.getMessage() + token);
            }
            case 10 -> {
                token = String.valueOf(GenerateToken.generateToken(10));
                System.out.println(Message.TOKEN.getMessage() + token);
            }
            case 15 -> {
                token = String.valueOf(GenerateToken.generateToken(15));
                System.out.println(Message.TOKEN.getMessage() + token);
            }
            default -> System.out.println(Message.WRONG_NUMBER.getMessage());
        }
    }
}