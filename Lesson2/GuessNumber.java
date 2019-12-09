import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int checkNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        randomNumber = (int)(Math.random() * 101);
        boolean isPlay = true;
        while (isPlay) {
            System.out.print("Ходит игрок: " + player1.getName() + " введите число от 0 до 100: ");
            player1.setNumber(enterNumber());
            checkNumber = player1.getNumber();
            isPlay = isCheckNumber();
            if (isPlay) {
                System.out.print("Ходит игрок: " + player2.getName() + " введите число от 0 до 100: ");
                player2.setNumber(enterNumber());
                checkNumber = player2.getNumber();
                isPlay = isCheckNumber();
            }
        }
    }

    private int enterNumber() {
        while (!scan.hasNextInt()) {
            System.out.print("Некорректное число, повторите ввод: ");
            scan.next();
        }
        int inputNumber = scan.nextInt();
        while (inputNumber < 0 || inputNumber > 100) {
            System.out.print("Введено число вне диапазона от 0 до 100, повторите ввод: ");
            inputNumber = scan.nextInt();
        }
        return inputNumber;
    }

    private boolean isCheckNumber() {
        if (checkNumber > randomNumber) {
            System.out.println("Ваше число больше того, что загадал компьютер\n");
        } else if (checkNumber < randomNumber) {
            System.out.println("Ваше число меньше того, что загадал компьютер\n");
        } else {
            System.out.println("Пебеда вы отгадали число!");
            return false;
        }
        return true;
    }
}
