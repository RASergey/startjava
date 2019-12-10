package com.startjava.lesson_1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int attempt = 25;
        final int guessedNumber = 87;

        while (attempt != guessedNumber) {
            System.out.println("Введите чиСло");
            if (attempt < 0) {
                System.out.println("Введите чиСло от 0 до 100");
                attempt *=0;
            } else if (attempt > 100) {
                System.out.println("Введите чиСло от 0 до 100");
                attempt = attempt - (attempt - 100);
            } else if (attempt > guessedNumber) {
                System.out.println("Введенное вами чиСло больше того, что загодал компьютер");
                attempt -=9;
            } else if (attempt < guessedNumber) {
                System.out.println("Введенное вами чиСло меньше того, что загодал компьютер");
                attempt +=10;
            }
        }
        System.out.println("Вы угадали!");
    }
}
