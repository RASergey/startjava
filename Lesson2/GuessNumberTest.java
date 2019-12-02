
import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        String askWork;
        boolean isMatchedNumber = true;

        Scanner scan = new Scanner(System.in);
        GuessNumber guess = new GuessNumber();
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        do {
            Player[] players = new Player[] {player1, player2};
            do {
                for (Player player :  players) {
                    System.out.print(player + " введите число от 0 до 100: ");
                    while(!(scan.hasNextInt())) {
                        System.out.print(player + " некорректное число, повторите ввод: ");
                        scan.next();
                    }
                    player.setNumber(scan.nextInt());
                    while(guess.isNumberInRange(player.getNumber())) {
                        System.out.print(player + " введено число вне диапазона от 0 до 100, повторите ввод: ");
                        player.setNumber(scan.nextInt());
                    }
                    if (guess.compareNumber(player.getName(),player.getNumber())) {
                        isMatchedNumber = false;
                        break;
                    }
                }
            } while (isMatchedNumber);
            do {
                System.out.print("Хотите повторить? да/нет: ");
                askWork = scan.next();
            } while(!(askWork.equals("да")) && !(askWork.equals("нет")));
            if (askWork.equals("нет")) {
                System.out.println("Закройте консоль.");
            }
        } while(askWork.equals("да"));
    }
}

