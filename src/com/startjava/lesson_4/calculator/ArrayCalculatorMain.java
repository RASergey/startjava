package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class ArrayCalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayCalculator operation = new ArrayCalculator();
        String askWork;
        do {
            System.out.print("Введите математическое выражение: ");
            operation.showResults();
            do {
                System.out.print("\nХотите продолжить? да/нет: ");
                askWork = scan.next();
            } while (!(askWork.equals("да")) && !(askWork.equals("нет")));
        } while (askWork.equals("да"));
        System.out.println("Закройте консоль.");
    }
}
