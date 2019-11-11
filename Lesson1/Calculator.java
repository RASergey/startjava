
public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 3;
        char sign = '+';
        int rezult;

        if (sign == '+') {
            rezult = firstNumber + secondNumber;
            System.out.println("Sum = " + rezult);
        } else if (sign == '-') {
            rezult = firstNumber - secondNumber;
            System.out.println("Difference = " + rezult);
        } else if (sign == '*') {
            rezult = firstNumber * secondNumber;
            System.out.println("Multiplication = " + rezult);
        } else if (sign == '/') {
            rezult = firstNumber / secondNumber;
            System.out.println("Divide = " + rezult);
        } else if (sign == '%') {
            rezult = firstNumber % secondNumber;
            System.out.println("Remainder of division = " + rezult);
        } else if (sign == '^') {
            rezult = firstNumber;
            for (int i = 1; i < secondNumber; i++) {
                rezult *= firstNumber;
            }
            System.out.println("Exponentiation = " + rezult);
        }
    }
}
