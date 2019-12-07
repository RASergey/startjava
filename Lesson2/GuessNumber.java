
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private String player1;
    private String player2;
    private int inputNumber;
    private int inputNumber1;
    private int inputNumber2;
    private int lowLimit = 0;
    private int highLimit = 101;
    private int randomNumber;
    private String gameOver;

    public GuessNumber(String player1, String player2, int inputNumber1, int inputNumber2) {
        this.player1 = player1;
        this.player2 = player2;
        this.inputNumber1 = inputNumber1;
        this.inputNumber2 = inputNumber2;
    }

    public String getGameOver() {
        return gameOver;
    }

    public void setGameOver(String gameOver) {
        this.gameOver = gameOver;
    }

    public void gameLogic() {

        while (!(scan.hasNextInt())) {
            System.out.print("Некорректное число, повторите ввод: ");
            scan.next();
        }
        inputNumber = scan.nextInt();
        while (inputNumber < lowLimit || inputNumber > highLimit) {
            System.out.print("Введено число вне диапазона от 0 до 100, повторите ввод: ");
            inputNumber = scan.nextInt();
        }
        if (inputNumber > randomNumber) {
            System.out.println("Ваше число больше того, что загадал компьютер\n");
        } else if (inputNumber < randomNumber) {
            System.out.println("Ваше число меньше того, что загадал компьютер\n");
        }
    }

    public void processingGame() {
        randomNumber = lowLimit + (int) (Math.random() * highLimit);
        do {
            System.out.print("Ходит игрок: " + player1 + " введите число от 0 до 100: ");
            gameLogic();
            inputNumber1 = inputNumber;
            if (inputNumber1 == randomNumber) {
                System.out.println("Пебеда " + player1 + " отгадал число" );
            }
            if (inputNumber1 != randomNumber) {
                System.out.print( "Ходит игрок: " + player2 + " введите число от 0 до 100: ");
                gameLogic();
                inputNumber2 = inputNumber;
            }
            if (inputNumber2 == randomNumber) {
                System.out.println("Пебеда " + player2 + " отгадал число" );
            }
        } while (inputNumber != randomNumber);
    }
}
