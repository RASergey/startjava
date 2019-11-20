import java.util.Scanner;

public class Calculator {

    int firstNumber;
    int secondNumber;
    char sign;
    int result;

    public void firstInputnumber() {
        System.out.println("Введите первое целое чиСло");
        Scanner scan = new Scanner(System.in);
        firstNumber = scan.nextInt();
    }

    public void inputSymbol() {
        System.out.println("Введите операцию:");
        Scanner scan = new Scanner(System.in);
        sign = scan.next().charAt(0);
    }

    public void secondInputnumber() {
        System.out.println("Введите второе целое чиСло");
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
                System.out.println("Введена некорректнаЯ операциЯ!");
                isCheckSign = false;
        }
        if (isCheckSign) {
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        } else {
            System.out.println("Повторите ввод...");
        }
    }
}
