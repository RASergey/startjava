public class Calculator {
    public int firstNumber;
    public int secondNumber;
    public char sign;
    public int result;

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
}

