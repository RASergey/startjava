package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;


    public Calculator(String[] mathExpression) {
        this.firstNumber = Integer.parseInt(mathExpression[0]);
        this.sign = mathExpression[1].charAt(0);
        this.secondNumber = Integer.parseInt(mathExpression[2]);
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return Math.floorDiv(firstNumber, secondNumber);
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            case '%':
                return firstNumber % secondNumber;
        }
        return calculate();
    }
}