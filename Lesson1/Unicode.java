public class Unicode {

    public static void main(String[] args) {
        char startSymbol = '\u0020';
        char endSymbol = '\u007F';

        while (startSymbol != endSymbol){
            System.out.println(startSymbol);
            startSymbol++;
        }
    }
}
