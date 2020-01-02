package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String[] args) {
        String gameOver;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guess = new GuessNumber(player1, player2);
        do {
            guess.startGame();
            do {
                System.out.print("Хотите повторить? y/n: ");
                gameOver = scan.nextLine();
            } while (!gameOver.equals("y") && !gameOver.equals("n"));
        } while (gameOver.equals("y"));
        System.out.println("Закройте консоль.");
    }
}
