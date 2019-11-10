public class ConditionalStatement {

    public static void main(String[] args) {
        int myAge = 36;
        boolean isMale = true;
        float myHeight = 1.74f;
        String theFirstLetterOfMyName = "С";

        if (myAge > 20) {
            System.out.println("I'm over twenty years old");
        }
        if (isMale) {
            System.out.println("I'm a man");
        } else {
            System.out.println("I'm definitely a man.");
        }
        if (myHeight < 1.80) {
            System.out.println("my height is below 1.80");
        } else {
            System.out.println("exactly below");
        }
        if (theFirstLetterOfMyName == "M") {
            System.out.println("definitely not an М");
        } else if (theFirstLetterOfMyName == "И") {
            System.out.println("definitely not an И");
        } else {
            System.out.println("My name with the letter C");
        }
    }
}
