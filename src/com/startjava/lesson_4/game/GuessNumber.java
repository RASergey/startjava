package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int index;
    private int attempt;
    private boolean isPlay;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Игра началась");
        setUP();
        movesOfThePlayers();
        System.out.println("\nЗа всю игру " + player1.getName() + " ввел числа: " + player1.getHistoryNumber());
        System.out.println("За всю игру " + player2.getName() + " ввел числа: " + player2.getHistoryNumber());
    }

    private void setUP() {
        randomNumber = (int) (Math.random() * 101);
        isPlay = true;
        player1.setHistoryNumber("");
        player2.setHistoryNumber("");
        index = 0;
        attempt = 0;
    }

    private void movesOfThePlayers() {
        System.out.println("У вас " + player1.getInputNumber().length + " попыток");
        while (isPlay) {
            moveOfThePlayer(player1);
            if (isPlay) {
                moveOfThePlayer(player2);
            }
            attempt++;
            index++;
            if (index > player1.getInputNumber().length - 1 && isPlay) {
                accountingForAttempts();
            }
        }
    }

    private void moveOfThePlayer(Player player) {
        System.out.print("Ходит игрок: " + player.getName() + " введите число от 0 до 100: ");
        player.setNumber(enterNumber());
        player.setInputNumber(player.getNumber(), index);
        isPlay = isTestForEquality(player);
        inputHistory(player);
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

    private boolean isTestForEquality(Player player) {
        if (player.getNumber() > randomNumber || player.getNumber() < randomNumber) {
            System.out.println(player.getName() + ", не угадал");
        } else {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (attempt + 1) + " попытки за всю игру");
            showNumbers(player);
            return false;
        }
        return true;
    }

    private void showNumbers(Player player) {
        if (isCheckContainsArrayNumbers(player.getInputNumber(), randomNumber)) {
            int[] showArray = Arrays.copyOf(player.getInputNumber(), index + 1);
            System.out.println("Попытки игрока: " + Arrays.toString(showArray) + " из " + player.getInputNumber().length + " последних предоставленных");
        }
    }

    private boolean isCheckContainsArrayNumbers(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    private void inputHistory(Player player) {
        player.setHistoryNumber(player.getHistoryNumber() + player.getNumber() + " ");
    }

    private void accountingForAttempts() {
        System.out.println("\nУ " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");
        Arrays.fill(player1.getInputNumber(), 0);
        Arrays.fill(player2.getInputNumber(), 0);
        index = 0;
        continueTheGame();
    }

    private void continueTheGame() {
        String gameOver = "";
        do {
            System.out.print("Ещё шанс! Продолжим? y/n: ");
            gameOver = scan.nextLine();
        } while (!gameOver.equals("y") && !gameOver.equals("n"));
        if (gameOver.equals("y")) {
            movesOfThePlayers();
        } else {
            isPlay = false;
        }
    }
}