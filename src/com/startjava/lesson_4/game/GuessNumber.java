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
        System.out.println("Игра началась");
        setUp();
        movesPlayers();
        System.out.println("\nЗа всю игру " + player1.getName() + " ввел числа: " + player1.getHistoryNumbers());
        System.out.println("За всю игру " + player2.getName() + " ввел числа: " + player2.getHistoryNumbers());
    }

    private void setUp() {
        randomNumber = (int) (Math.random() * 101);
        player1.resetHistoryNumbers();
        player2.resetHistoryNumbers();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private void movesPlayers() {
        System.out.println("У вас " + player1.getEnteredNumbers().length + " попыток");
        do {
            if (makeMove(player1)) {
                recordHistoryNumbers();
                return;
            }
            if (makeMove(player2)) {
                recordHistoryNumbers();
                return;
            }
        } while (player1.getAttempt() < player1.getEnteredNumbers().length && player2.getAttempt() < player2.getEnteredNumbers().length);
        resettingAttempts();
    }

    private boolean makeMove(Player player) {
        System.out.print("Ходит игрок: " + player.getName() + " введите число от 0 до 100: ");
        player.setEnteredNumbers(enterNumber());
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
        if (player.getEnteredNumber() != randomNumber) {
            System.out.println(player.getName() + ", не угадал");
            player.setAttempt(player.getAttempt() + 1);
            return false;
        } else {
            System.out.print("\nИгрок " + player.getName() + " угадал число " + player.getEnteredNumber() + " c " + (player.getAttempt() + 1) + " попытки из " + player.getEnteredNumbers().length + " последних предоставленных");
            System.out.println(" Попытки игрока: " + Arrays.toString(Arrays.copyOf(player.getEnteredNumbers(), player.getAttempt() + 1)));
            player.setAttempt(player.getAttempt() + 1);
            return true;
        }
    }

    private void resettingAttempts() {
        recordHistoryNumbers();
        System.out.println("\nУ " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");
        Arrays.fill(player1.getEnteredNumbers(), 0);
        Arrays.fill(player2.getEnteredNumbers(), 0);
        player1.setAttempt(0);
        player2.setAttempt(0);
        continueTheGame();
    }

    private void recordHistoryNumbers() {
        player1.addAllNumbers();
        player2.addAllNumbers();
    }

    private void continueTheGame() {
        String gameOver;
        do {
            System.out.print("Ещё шанс! Продолжим? y/n: ");
            gameOver = scan.nextLine();
        } while (!gameOver.equals("y") && !gameOver.equals("n"));
        if (gameOver.equals("y")) {
            movesPlayers();
        }
    }
}