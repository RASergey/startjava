package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String historyResult = "";
        String askWork;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scan.nextLine();
            String[] parsedMathExpression = mathExpression.split(" ");
            Calculator operation = new Calculator(Integer.parseInt(parsedMathExpression[0]), parsedMathExpression[1].charAt(0), Integer.parseInt(parsedMathExpression[2]));
            historyResult = historyResult + operation.calculate() + "; ";
            for (String reverse : historyResult.split(" ")) {
                System.out.print(" = " + reverse);
            }
            do {
                System.out.print("\nХотите продолжить? да/нет: ");
                askWork = scan.nextLine();
            } while (!(askWork.equals("да")) && !(askWork.equals("нет")));
        } while (askWork.equals("да"));
        System.out.println("Закройте консоль.");
    }
}