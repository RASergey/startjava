import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;

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
            isPlay = isCheckNumber1();
            if (isPlay) {
                System.out.print("Ходит игрок: " + player2.getName() + " введите число от 0 до 100: ");
                player2.setNumber(enterNumber());
                isPlay = isCheckNumber2();
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

    private boolean isCheckNumber1() {
        if (player1.getNumber() > randomNumber) {
            System.out.println(player1.getName() + ", ваше число больше того, что загадал компьютер\n");
        } else if (player1.getNumber() < randomNumber) {
            System.out.println(player1.getName() + ", ваше число меньше того, что загадал компьютер\n");
        } else {
            System.out.println(player1.getName() + ", пебеда вы отгадали число!");
            return false;
        }
        return true;
    }

    private boolean isCheckNumber2() {
        if (player2.getNumber() > randomNumber) {
            System.out.println(player2.getName() + ", ваше число больше того, что загадал компьютер\n");
        } else if (player2.getNumber() < randomNumber) {
            System.out.println(player2.getName() + ", ваше число меньше того, что загадал компьютер\n");
        } else {
            System.out.println(player2.getName() + ", пебеда вы отгадали число!");
            return false;
        }
        return true;
    }
}
