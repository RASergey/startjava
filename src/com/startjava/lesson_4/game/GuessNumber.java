package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int[] inputNumber1 = new int[10];
    private int[] inputNumber2 = new int[10];
    private int index = 0;
    private int attempt = 0;
    private boolean isPlay;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Игра началась");
        newGame();
        randomNumber = (int) (Math.random() * 101);
        movesOfThePlayers();
    }

    private void movesOfThePlayers() {
        System.out.println("У вас " + inputNumber1.length + " попыток");
        while (isPlay) {
            System.out.print("Ходит игрок: " + player1.getName() + " введите число от 0 до 100: ");
            player1.setNumber(enterNumber());
            inputNumber1[index] = player1.getNumber();
            isPlay = isCheckNumber(player1);
            inputHistory(player1);
            if (isPlay) {
                System.out.print("Ходит игрок: " + player2.getName() + " введите число от 0 до 100: ");
                player2.setNumber(enterNumber());
                inputNumber2[index] = player2.getNumber();
                isPlay = isCheckNumber(player2);
                inputHistory(player2);
            }
            ++attempt;
            ++index;
            if (index > inputNumber1.length - 1 && isPlay) {
                accountingForAttempts();
            }
        }
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

    private boolean isCheckNumber(Player player) {
        if (player.getNumber() > randomNumber || player.getNumber() < randomNumber) {
            System.out.println(player.getName() + ", не угадал");
        } else {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (attempt + 1) + " попытки за всю игру");
            showArrayNumbers();
            return false;
        }
        return true;
    }

    private void accountingForAttempts() {
        System.out.println("\nУ " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");
        index = 0;
        Arrays.fill(inputNumber1, 0);
        Arrays.fill(inputNumber2, 0);
        gameOver();
    }

    private void gameOver() {
        String gameOver = "";
        do {
            System.out.print("Второй шанс, продолжим? y/n: ");
            gameOver = scan.nextLine();
        } while (!gameOver.equals("y") && !gameOver.equals("n"));
        if (gameOver.equals("y")) {
            movesOfThePlayers();
        }
    }

    private void showArrayNumbers() {
        if (isCheckContainsArrayNumbers(inputNumber1, randomNumber)) {
            int[] showArray = Arrays.copyOf(inputNumber1, index + 1);
            System.out.println("Попытки игрока: " + Arrays.toString(showArray) + " из " + inputNumber1.length + " последних предоставленных");
        }
        if (isCheckContainsArrayNumbers(inputNumber2, randomNumber)) {
            int[] showArray = Arrays.copyOf(inputNumber2, index + 1);
            System.out.println("Попытки игрока: " + Arrays.toString(showArray) + " из " + inputNumber1.length + " последних предоставленных");
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

    private void newGame() {
        isPlay = true;
        player1.setHistoryNumber("");
        player2.setHistoryNumber("");
        index = 0;
        attempt = 0;
    }

    private void inputHistory(Player player) {
        player.setHistoryNumber(player.getHistoryNumber() + player.getNumber() + " ");
    }
}