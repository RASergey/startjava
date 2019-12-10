package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public int firstNumber;
    public int secondNumber;
    public char sign;

    public int calculate() {
        switch (sign) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '^':
            int counter = firstNumber;
                for (int i = 1; i < secondNumber; i++) {
                    counter *= firstNumber;
                }
                return counter;
            case '%':
                return firstNumber % secondNumber;
        }
        return calculate();
    }
}
