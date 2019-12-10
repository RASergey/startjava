package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

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
                System.out.print("Хотите повторить? да/нет: ");
                gameOver = scan.next();
            } while (!gameOver.equals("да") && !gameOver.equals("нет"));
        } while (gameOver.equals("да"));
        System.out.println("Закройте консоль.");
    }
}
