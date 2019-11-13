
public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 3;
        char sign = '+';
        int result;

        if (sign == '+') {
            result = firstNumber + secondNumber;
            System.out.println("Sum = " + result);
        } else if (sign == '-') {
            result = firstNumber - secondNumber;
            System.out.println("Difference = " + result);
        } else if (sign == '*') {
            result = firstNumber * secondNumber;
            System.out.println("Multiplication = " + result);
        } else if (sign == '/') {
            result = firstNumber / secondNumber;
            System.out.println("Divide = " + result);
        } else if (sign == '%') {
            result = firstNumber % secondNumber;
            System.out.println("Remainder of division = " + result);
        } else if (sign == '^') {
            result = firstNumber;
            for (int i = 1; i < secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println("Exponentiation = " + result);
        }
    }
}
