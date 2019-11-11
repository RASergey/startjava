public class MyFirstGame {

    public static void main(String[] args) {
        int attempt = 39;           // число которое меняется игроком
        final int guessedNumber = 30;    // загаданное число

        if (attempt >= 0 && attempt <= 100) {
            System.out.println("You entered the number : " + attempt);
                if (guessedNumber != attempt) {
                    if (attempt <= guessedNumber-30) {
                        System.out.println("your number is much smaller");
                    } else if (attempt >= guessedNumber+30) {
                        System.out.println("your number is much larger");
                    } else if (attempt <= guessedNumber-15) {
                        System.out.println("your number is smaller");
                    } else if (attempt >= guessedNumber+15) {
                        System.out.println("your number is bigger");
                    } else if (attempt <= guessedNumber-1) {
                        System.out.println("your number is slightly smaller");
                    } else if (attempt >= guessedNumber+1) {
                        System.out.println("your number is slightl largeyr");
                    }
                } else {
                    System.out.println("You guessed it! Guessed number : " + guessedNumber);
                }
        } else {
            System.out.println("The number is not in the range from 0 to 100");
        }
    }
}
