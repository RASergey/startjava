public class MyFirstGame {

    public static void main(String[] args) {
        int guessedNumber = 30;
        int attempt = 100;

        System.out.println("Enter a number in the range from 0 to 100");
        if (attempt >= 0 && attempt <= 100) {
            System.out.println("You entered the number : " + attempt);
            if (guessedNumber != attempt) {
                while (guessedNumber != attempt){
                    if (attempt <= (guessedNumber -20)||(attempt >= guessedNumber + 20)) {
                        System.out.println("You are still far!");
                    }else if (attempt <= guessedNumber - 10 || attempt >= guessedNumber + 10)
                        System.out.println("You're in the right direction");
                    }else if (attempt <= guessedNumber - 1 || attempt >= guessedNumber + 1) {
                        System.out.println("Don't give up the goal is in front of you");
                    }
                    System.out.println("Try it again"); break;
                }
            }else{
                System.out.println("You won! Guessed number : " + guessedNumber);
            }
        }else{
            System.out.println("The number is not in the range from 0 to 100");
        }
    }
}
