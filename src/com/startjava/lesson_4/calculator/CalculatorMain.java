package com.startjava.lesson_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] historyResult = new int[10];
        int index = 0;
        String askWork;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scan.nextLine();
            Calculator calc = new Calculator(mathExpression.split(" "));
            calc.calculate();
            historyResult[index] = calc.getResult();
            System.out.println("= " + calc.getResult());
            int[] showHistory = Arrays.copyOf(historyResult, index + 1);
            System.out.println("История полученых результатов " + Arrays.toString(showHistory));
            index++;
            if (index > 9) {
                System.out.println("Обнуление истории");
                Arrays.fill(historyResult, 0);
                index = 0;
            }
            do {
                System.out.print("\nХотите продолжить? y/n: ");
                askWork = scan.nextLine();
            } while (!askWork.equals("y") && !askWork.equals("n"));
        } while (askWork.equals("y"));
        System.out.println("Закройте консоль.");
    }
}