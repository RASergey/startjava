public class Cycle {

    public static void main(String[] args) {
        int rangeTwenty;

        for (int i = 0; i <= 20; i++ ) {
            rangeTwenty = i;
            System.out.println(rangeTwenty);
        }

        int step = 1;
        int numberCounter = 6;

        while (step < 26) {
            System.out.println(numberCounter);
            numberCounter--;
            step += 2;
        }

        int oddNumber = 9;
        int sumOfOddNumber = 0;

        do {
            oddNumber += 2;
            sumOfOddNumber += oddNumber;
        } while (oddNumber < 19);
        System.out.println(sumOfOddNumber);
    }
}
