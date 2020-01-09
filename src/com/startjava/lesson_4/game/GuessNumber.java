package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        do {
            System.out.println("\nИгра началась");
            startGameplay();
            setUpDefaultValues();
        } while (isContinueGame());
        showHistoryGames();
    }

    private void startGameplay() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("У вас " + player1.getEnteredNumbers().length + " попыток");
        for (int i = 0; i < 10; i++) {
            if (makeMove(player1)) {
                return;
            }
            if (makeMove(player2)) {
                return;
            }
        }
        System.out.println("\nУ " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");
    }

    private boolean makeMove(Player player) {
        System.out.print("Ходит игрок: " + player.getName() + " введите число от 0 до 100: ");
        player.setEnteredNumber(enterNumber());
        player.setAttempt(player.getAttempt() + 1);
        return compareNumbers(player);
    }

    private int enterNumber() {
        while (!scan.hasNextInt()) {
            System.out.print("Некорректное число, повторите ввод: ");
            scan.next();
        }
        int inputNumber = scan.nextInt();
        while (inputNumber < 0 || inputNumber > 100) {
            System.out.print("Введено число вне диапазона от 0 до 100, повторите ввод: ");
            inputNumber = scan.nextInt();
        }
        scan.nextLine();
        return inputNumber;
    }

    private boolean compareNumbers(Player player) {
        if (player.LastNumber() != randomNumber) {
            System.out.println(player.getName() + ", не угадал");
            return false;
        } else {
            System.out.print("\nИгрок " + player.getName() + " угадал число " + player.LastNumber() + " c " + (player.getAttempt()) + " попытки из " + ((player.getEnteredNumbers().length)));
            System.out.println(" Попытки игрока: " + Arrays.toString(Arrays.copyOf(player.getEnteredNumbers(), player.getAttempt())));
            return true;
        }
    }

    private void setUpDefaultValues() {
        player1.addAllNumbers();
        player2.addAllNumbers();
        Arrays.fill(player1.getEnteredNumbers(), 0);
        Arrays.fill(player2.getEnteredNumbers(), 0);
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private boolean isContinueGame() {
        String gameOver;
        do {
            System.out.print("Повторим? y/n: ");
            gameOver = scan.nextLine();
        } while (!gameOver.equals("y") && !gameOver.equals("n"));
        return gameOver.equals("y");
    }

    private void showHistoryGames() {
        System.out.println("\nЗа всю игру " + player1.getName() + " ввел числа: " + player1.getHistoryNumbers());
        System.out.println("За всю игру " + player2.getName() + " ввел числа: " + player2.getHistoryNumbers());
        player1.clearHistoryNumbers();
        player2.clearHistoryNumbers();
    }
}