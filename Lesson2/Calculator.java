public class Calculator {
    public int firstNumber;
    public int secondNumber;
    public char sign;
    public int result;

    public int result() {
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
        }
        return result;
    }
}

