package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Calculator operation = new Calculator();
        int[] historyResult = new int[10];
        String askWork;
        int index = 0;
        String buff = "";

        do {
            System.out.print("Введите математическое выражение: ");
            String mathematicalExpression = scan.nextLine();
            String[] words = mathematicalExpression.split(" ");
            operation.setFirstNumber(Integer.parseInt(words[0])); // первое число
            operation.setSign(words[1].charAt(0)); // математический оператор
            operation.setSecondNumber(Integer.parseInt(words[2])); // второе число
            historyResult[index] = operation.calculate(); // сохраняем результат в массиве
            System.out.println("= " + historyResult[index]);
            buff = buff + historyResult[index] + " ";   // переводим результат в строку с добавлением в список результатов
            System.out.println("Сохранённые результаты: ");
            for (String reverse : buff.split(" ")) { // выводим список в консоль
                System.out.print(reverse + "; ");
            }
            ++index;
            if (index > historyResult.length - 1) { // проверка на границы массива и перезапись массива
                index = 0;
            }
            do {
                System.out.print("\nХотите продолжить? да/нет: ");
                askWork = scanner.next();
            } while (!(askWork.equals("да")) && !(askWork.equals("нет")));
        } while (askWork.equals("да"));
        System.out.println("Закройте консоль.");
    }
}