
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private String player1;
    private String player2;
    private int inputNumber;
    private int inputNumber1;
    private int inputNumber2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1.getName();
        this.player2 = player2.getName();
        this.inputNumber1 = player1.getNumber();
        this.inputNumber2 = player2.getNumber();
    }

    private void enterNumber() {
        while (!(scan.hasNextInt())) {
            System.out.print("Некорректное число, повторите ввод: ");
            scan.next();
        }
        inputNumber = scan.nextInt();
        while (inputNumber < 0 || inputNumber > 100) {
            System.out.print("Введено число вне диапазона от 0 до 100, повторите ввод: ");
            System.out.println("");
            inputNumber = scan.nextInt();
        }
    }

    private void checkNumber() {
        if (inputNumber > randomNumber) {
            System.out.println("Ваше число больше того, что загадал компьютер\n");
        } else if (inputNumber < randomNumber) {
            System.out.println("Ваше число меньше того, что загадал компьютер\n");
        }
    }

    public void startGame() {
        randomNumber =(int)(Math.random() * 101);
        do {
            System.out.print("Ходит игрок: " + player1 + " введите число от 0 до 100: ");
            enterNumber();
            checkNumber();
            inputNumber1 = inputNumber;
            if (inputNumber1 == randomNumber) {
                System.out.println("Пебеда " + player1 + " отгадал число" );
            }
            if (inputNumber1 != randomNumber) {
                System.out.print( "Ходит игрок: " + player2 + " введите число от 0 до 100: ");
                enterNumber();
                checkNumber();
                inputNumber2 = inputNumber;
            }
            if (inputNumber2 == randomNumber) {
                System.out.println("Пебеда " + player2 + " отгадал число" );
            }
        } while (inputNumber != randomNumber);
    }
}
