
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String askWork;

        Calculator operation = new Calculator();
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите первое целое чиСло : ");
            operation.firstNumber = scan.nextInt();
            System.out.print("Введите операцию :");
            Scanner scan1 = new Scanner(System.in);
            operation.sign = scan1.next().charAt(0);
            System.out.print("Введите второе целое чиСло : ");
            Scanner scan2 = new Scanner(System.in);
            operation.secondNumber = scan2.nextInt();
            operation.result();
            System.out.print("Хотите продолжить? yes/no: ");
            Scanner scan3 = new Scanner(System.in);
            askWork = scan3.next();
            if (!(askWork.equals("yes")) && !(askWork.equals("no"))) {
                while(!(askWork.equals("yes")) && !(askWork.equals("no"))) {
                    System.out.print("Хотите продолжить? yes/no: ");
                    Scanner scan4 = new Scanner(System.in);
                    askWork = scan4.next();
                }
            }
            if (askWork.equals("no")) {
                System.out.println("Закройте конСоль.");
            }
        }while (askWork.equals("yes"));
    }
}
