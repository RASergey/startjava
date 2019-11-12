public class MyFirstGame {

    public static void main(String[] args) {
        int attempt = 45;
        final int guessedNumber = 55;

        System.out.println("You entered the number: " + attempt);
        do {
            if (attempt != guessedNumber) {
                if (attempt > 0 && attempt < 100) {
                    if (attempt < guessedNumber) {
                        System.out.println("The number entered by you is more (less) than what the computer wished for");
                    } else if (attempt > guessedNumber) {
                        System.out.println("The number entered by you is more (more) that the computer made a wish");
                    }
                } else {
                    System.out.println("The number is not in the range from 0 to 100");
                }
                System.out.println("Enter a number: ");
                break;
            } else {
                System.out.println("You guessed it!");
            }
        } while (attempt != guessedNumber);
    }
}
