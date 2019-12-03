
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Player inputNumber = new Player();
    private int hiddenNumber = 0 + (int) (Math.random() * 100);
    private int lowLimit = 0;
    private int highLimit = 100;
    private String askWork;
    private boolean isMatchedNumber = true;

    public void processingGame(String player1, String player2) {
        String[] players = new String[]{player1, player2};
        do {
            do {
                for (String player : players) {
                    System.out.print(player + " введите число от 0 до 100: ");
                    while (!(scan.hasNextInt())) {
                        System.out.print(player + " некорректное число, повторите ввод: ");
                        scan.next();
                    }
                    System.out.println(hiddenNumber);
                    inputNumber.setNumber(scan.nextInt());
                    while (isNumberInRange()) {
                        System.out.print(player + " введено число вне диапазона от 0 до 100, повторите ввод: ");
                        inputNumber.setNumber(scan.nextInt());
                    }
                    if (isCompareNumber()) {
                        isMatchedNumber = false;
                        break;
                    }
                }
            } while (isMatchedNumber);
            System.out.print("Хотите повторить? да/нет: ");
            askWork = scan.next();
            while(!(askWork.equals("да")) && !(askWork.equals("нет")));
                if (askWork.equals("нет")) {
                    System.out.println("Закройте консоль.");
                }
        } while(askWork.equals("да"));
    }

    public boolean isNumberInRange() {
        return inputNumber.getNumber() < lowLimit || inputNumber.getNumber() > highLimit;
    }

    public boolean isCompareNumber() {
        if (inputNumber.getNumber() > hiddenNumber) {
            System.out.println("Ваше число больше того, что загодал компьютер");
            return false;
        } else if (inputNumber.getNumber() < hiddenNumber) {
            System.out.println("Ваше число меньше того, что загодал компьютер");
            return false;
        } else {
            System.out.println("Угадал число. Победа!!!");
            return true;
        }
    }
}
