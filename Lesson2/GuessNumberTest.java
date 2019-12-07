
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guess = new GuessNumber(player1.getName(), player2.getName(), player1.getNumber(), player2.getNumber());
        do {
            guess.processingGame();
            System.out.print("Хотите повторить? да/нет: ");
            guess.setGameOver(scan.next());
            while(!(guess.getGameOver().equals("да")) && !(guess.getGameOver().equals("нет"))) {
                System.out.print("Хотите повторить? да/нет: ");
                guess.setGameOver(scan.next());
            }
            if (guess.getGameOver().equals("нет")) {
                System.out.println("Закройте консоль.");
            }
        } while(guess.getGameOver().equals("да"));

    }
}
