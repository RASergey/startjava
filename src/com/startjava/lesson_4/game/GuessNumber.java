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
        System.out.println("\nЗа всю игру " + player1.getName() + " ввел числа: " + player1.getHistoryNumber());
        System.out.println("За всю игру " + player2.getName() + " ввел числа: " + player2.getHistoryNumber());
    }

    private void setUp() {
        randomNumber = (int) (Math.random() * 101);
        player1.setHistoryNumber("");
        player2.setHistoryNumber("");
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private void movesPlayers() {
        System.out.println("У вас " + player1.getInputNumber().length + " попыток");
        do {
            if (makeMove(player1)) {
                return;
            }
            if (makeMove(player2)) {
                return;
            }
            player1.setAttempt(player1.getAttempt() + 1);
            player2.setAttempt(player2.getAttempt() + 1);
        } while (player1.getAttempt() < player1.getInputNumber().length - 1 && player2.getAttempt() < player2.getInputNumber().length);
        resettingAttempts();
    }

    private boolean makeMove(Player player) {
        System.out.print("Ходит игрок: " + player.getName() + " введите число от 0 до 100: ");
        player.setInputNumber(enterNumber(), player.getAttempt());
        player.setHistoryNumber(player.getHistoryNumber() + Arrays.toString(Arrays.copyOfRange(player.getInputNumber(), player.getAttempt(), player.getAttempt() + 1)) + " ");
        compareNumbers(player);
        return isContainsNumber(player.getInputNumber(), randomNumber);
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

    private void compareNumbers(Player player) {
        if (!isContainsNumber(player.getInputNumber(), randomNumber)) {
            System.out.println(player.getName() + ", не угадал");
        } else {
            System.out.print("\nИгрок " + player.getName() + " угадал число " + Arrays.toString(Arrays.copyOfRange(player.getInputNumber(), player.getAttempt(), player.getAttempt() + 1)) + " c " + (player.getAttempt() + 1) + " попытки из " + player.getInputNumber().length + " последних предоставленных");
            int[] showArray = Arrays.copyOf(player.getInputNumber(), player.getAttempt() + 1);
            System.out.println(" Попытки игрока: " + Arrays.toString(showArray));
        }
    }

    private boolean isContainsNumber(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    private void resettingAttempts() {
        System.out.println("\nУ " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");
        Arrays.fill(player1.getInputNumber(), 0);
        Arrays.fill(player2.getInputNumber(), 0);
        player1.setAttempt(0);
        player2.setAttempt(0);
        continueTheGame();
    }

    private void continueTheGame() {
        String gameOver = "";
        do {
            System.out.print("Ещё шанс! Продолжим? y/n: ");
            gameOver = scan.nextLine();
        } while (!gameOver.equals("y") && !gameOver.equals("n"));
        if (gameOver.equals("y")) {
            movesPlayers();
        } else {
            return;
        }
    }
}