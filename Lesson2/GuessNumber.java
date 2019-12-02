public class GuessNumber {
    private int hiddenNumber= 0 + (int)(Math.random() * 100);
    private int lowLimit = 0;
    private int highLimit = 100;

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public boolean isNumberInRange(int numberInRange) {
        return numberInRange < lowLimit || numberInRange > highLimit;
    }

    public boolean compareNumber(String namePlayer, int inputNumber) {
        if (inputNumber > getHiddenNumber()) {
            System.out.println(namePlayer + " ваше число больше того, что загодал компьютер");
            return false;
        } else if (inputNumber < getHiddenNumber()) {
            System.out.println(namePlayer + " ваше число меньше того, что загодал компьютер");
            return false;
        } else {
            System.out.println(namePlayer + " Угадал число. Победа!!!");
            return true;
        }
    }
}
