public class Wolf {

    String genderWolf;
    String nameWolf;
    float weightWolf;
    byte ageWolf;
    String colorWolf;

    boolean goWolf() {
        System.out.print("Идёт - ");
        return false;
    }

    boolean runWolf() {
        System.out.print("\nБежит - ");
        return true;
    }

    boolean howlWolf(){
        System.out.print("\nВоет - ");
        return false;
    }

    boolean hunterWolf(){
        System.out.print("\n\"охотитСЯ\" - ");
        return true;
    }
}
