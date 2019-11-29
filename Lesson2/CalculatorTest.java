
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String askWork;
        Calculator operation = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите первое целое чиcло : ");
            while(!(scan.hasNextInt())) {
                System.out.print("Hекорректное чиcло, повторите ввод: ");
                scan.next();
            }
            operation.firstNumber = scan.nextInt();
            System.out.print("Введите операцию :");
            operation.sign = scan.next().charAt(0);
            System.out.print("Введите второе целое чиcло : ");
            while(!(scan.hasNextInt())) {
                System.out.print("Hекорректное чиcло, повторите ввод: ");
                scan.next();
            }
            operation.secondNumber = scan.nextInt();
            System.out.println(" = " + operation.calculate());
            do {
                System.out.print("Хотите продолжить? да/нет: ");
                askWork = scan.next();
            } while(!(askWork.equals("да")) && !(askWork.equals("нет")));
            if (askWork.equals("нет")) {
                System.out.println("Закройте консоль.");
            }
        } while(askWork.equals("да"));
    }
}
