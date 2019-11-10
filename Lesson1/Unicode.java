public class Unicode {

    public static void main(String[] args) {
        char cycleStart = '\u0020';
        char cycleEnd = '\u007F';

        while (cycleStart != cycleEnd){
            System.out.println(cycleStart);
            cycleStart++;
        }
    }
}
