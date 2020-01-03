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
        index = 0;
        attempt = 0;
    }

    private void movesPlayers() {
        System.out.println("У вас " + player1.getInputNumber().length + " попыток");
        while (true) {
            if (isMakeMove(player1)) {
                break;
            }
            if (isMakeMove(player2)) {
                break;
            }
            attempt++;
            index++;
            if (index > player1.getInputNumber().length - 1) {
                resettingAttempts();
                if (isContinueTheGame()) {
                    break;
                }
            }
        }
    }

    private boolean isMakeMove(Player player) {
        System.out.print("Ходит игрок: " + player.getName() + " введите число от 0 до 100: ");
        player.setNumber(enterNumber());
        player.setInputNumber(player.getNumber(), index);
        inputHistory(player);
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

    private void inputHistory(Player player) {
        player.setHistoryNumber(player.getHistoryNumber() + player.getNumber() + " ");
    }

    private void compareNumbers(Player player) {
        if (!isContainsNumber(player.getInputNumber(), randomNumber)) {
            System.out.println(player.getName() + ", не угадал");
        } else {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (attempt + 1) + " попытки за всю игру");
            int[] showArray = Arrays.copyOf(player.getInputNumber(), index + 1);
            System.out.println("Попытки игрока: " + Arrays.toString(showArray) + " из " + player.getInputNumber().length + " последних предоставленных");
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
        index = 0;
    }

    private boolean isContinueTheGame() {
        String gameOver = "";
        do {
            System.out.print("Ещё шанс! Продолжим? y/n: ");
            gameOver = scan.nextLine();
        } while (!gameOver.equals("y") && !gameOver.equals("n"));
        if (gameOver.equals("y")) {
            return false;
        } else {
            return true;
        }
    }
}