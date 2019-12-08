import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int inputNumber;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        randomNumber = (int)(Math.random() * 101);
        do {
            System.out.print("Ходит игрок: " + player1.getName() + " введите число от 0 до 100: ");
            enterNumber();
            checkNumber();
            player1.setNumber(inputNumber);
            if (player1.getNumber() != randomNumber) {
                System.out.print( "Ходит игрок: " + player2.getName() + " введите число от 0 до 100: ");
                enterNumber();
                checkNumber();
                player2.setNumber(inputNumber);
            }
        } while (inputNumber != randomNumber);
    }

    private void enterNumber() {
        while (!scan.hasNextInt()) {
            System.out.print("Некорректное число, повторите ввод: ");
            scan.next();
        }
        inputNumber = scan.nextInt();
        while (inputNumber < 0 || inputNumber > 100) {
            System.out.print("Введено число вне диапазона от 0 до 100, повторите ввод: ");
            inputNumber = scan.nextInt();
        }
    }

    private void checkNumber() {
        if (inputNumber > randomNumber) {
            System.out.println("Ваше число больше того, что загадал компьютер\n");
        } else if (inputNumber < randomNumber) {
            System.out.println("Ваше число меньше того, что загадал компьютер\n");
        } else {
            System.out.println("Пебеда вы отгадали число!" );
        }
    }
}
