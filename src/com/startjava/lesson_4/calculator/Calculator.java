package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public Calculator(int firstNumber, char sign, int secondNumber) {
        this.firstNumber = firstNumber;
        this.sign = sign;
        this.secondNumber = secondNumber;
    }

    public String calculate() {
        String result = "";
        switch (sign) {
            case '+':
                return result + Math.addExact(firstNumber, secondNumber);
            case '-':
                return result + Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return result + Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return result + Math.floorDiv(firstNumber, secondNumber);
            case '^':
                return result + Math.pow(firstNumber, secondNumber);
            case '%':
                return result + firstNumber % secondNumber;
            default:
                System.out.println("Введена некорректная операция! Повторите ввод...");
        }
        return null;
    }
}