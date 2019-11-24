public class Calculator {
    public int firstNumber;
    public int secondNumber;
    public char sign;
    public int calculate;

    public int result() {
        switch (sign) {
            case '+':
                calculate = firstNumber + secondNumber;
                break;
            case '-':
                calculate = firstNumber - secondNumber;
                break;
            case '*':
                calculate = firstNumber * secondNumber;
                break;
            case '/':
                calculate = firstNumber / secondNumber;
                break;
            case '^':
                calculate = firstNumber;
                for (int i = 1; i < secondNumber; i++) {
                    calculate *= firstNumber;
                }
                break;
            case '%':
                calculate = firstNumber % secondNumber;
                break;
        }
        return calculate;
    }
}

