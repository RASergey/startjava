
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String askWork;

        Calculator operation = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите первое целое чиСло : ");
            if (scan.hasNextInt()) {
                operation.firstNumber = scan.nextInt();
            }
            System.out.print("Введите операцию :");
            if (scan.hasNext()) {
                operation.sign = scan.next().charAt(0);
            }
            System.out.print("Введите второе целое чиСло : ");
            if (scan.hasNextInt()) {
                operation.secondNumber = scan.nextInt();
            }
            System.out.println(" = " + operation.result());
            do {
                System.out.print("Хотите продолжить? yes/no: ");
                askWork = scan.next();
            } while (!(askWork.equals("yes")) && !(askWork.equals("no")));
            if (askWork.equals("no")) {
                System.out.println("Закройте конСоль.");
            }
        } while (askWork.equals("yes"));
    }
}
