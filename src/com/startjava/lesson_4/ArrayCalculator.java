package com.startjava.lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCalculator {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Integer> results = new ArrayList<>();
    private String mathematicalExpression;
    private int firstNumber;
    private int result;
    private int secondNumber;
    private char sign;
    private String show = "";

    public void showResults() {
        mathematicalExpression = scan.nextLine();
        convertingNumbers();
        calculate();
        results.add(result);
        String buff = "";
        for (Integer number : results) {
            buff = number + " ";
        }
        System.out.println("= " + buff);
        show = show + buff;
        System.out.println("Сохранённые результаты: ");
        for (String reverse : show.split(" ")) {
            System.out.print(reverse + "; ");
        }
    }

    private void convertingNumbers() {
        String[] reverse = new String[3];
        int counter = 0;
        for (String buff : mathematicalExpression.split(" ")) {
            reverse[counter] = buff;
            counter++;
        }
        firstNumber = Integer.parseInt(reverse[0]);
        sign = reverse[1].charAt(0);
        secondNumber = Integer.parseInt(reverse[2]);
    }

    private void calculate() {
        switch (sign) {
            case '+':
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case '-':
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case '*':
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case '/':
                result = Math.floorDiv(firstNumber, secondNumber);
                break;
            case '^':
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
        }
    }
}
