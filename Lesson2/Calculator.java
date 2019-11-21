
import java.util.Scanner;

public class Calculator {
    int firstNumber;
    int secondNumber;
    char sign;
    int result;

    public void firstInputnumber() {
        System.out.print("Введите первое целое чиСло : ");
        Scanner scan = new Scanner(System.in);
        firstNumber = scan.nextInt();
    }

    public void inputSymbol() {
        System.out.print("Введите операцию :");
        Scanner scan = new Scanner(System.in);
        sign = scan.next().charAt(0);
    }

    public void secondInputnumber() {
        System.out.print("Введите второе целое чиСло : ");
        Scanner scan = new Scanner(System.in);
        secondNumber = scan.nextInt();
    }

    public void result() {
        boolean isCheckSign = true;
        switch (sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '^':
                result = firstNumber;
                for (int i = 1; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                isCheckSign = false;
        }
        if (isCheckSign) {
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else {
            System.out.println("Введена некорректнаЯ операциЯ! Повторите ввод...");
        }
    }

    public void askWork() {
        System.out.print("Хотите продолжить? yes/no: ");
        Scanner scan = new Scanner(System.in);
        String askWork = scan.next();
        while (askWork.equals("yes")) {
            calculatorOperation();
        }
        if (!(askWork.equals("no"))) {
            askWork();
        } else {
            System.out.println("Закройте конСоль.");
        }
    }
    public void calculatorOperation() {
        firstInputnumber();
        inputSymbol();
        secondInputnumber();
        result();
        askWork();
    }
}

