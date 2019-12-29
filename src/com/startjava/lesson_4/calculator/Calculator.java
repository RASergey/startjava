package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;
    private int result;

    public int getResult() {
        return result;
    }

    public Calculator(String[] mathExpression) {
        this.firstNumber = Integer.parseInt(mathExpression[0]);
        this.sign = mathExpression[1].charAt(0);
        this.secondNumber = Integer.parseInt(mathExpression[2]);
    }

    public void calculate() {
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
            default:
                System.out.println("Введена некорректная операция! Повторите ввод...");
        }
    }
}