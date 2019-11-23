public class Wolf {

    public String gender;
    public String name;
    public float weight;
    public byte age;
    public String color;

    public boolean go() {
        System.out.print("Идёт - ");
        return false;
    }

    public boolean run() {
        System.out.print("\nБежит - ");
        return true;
    }

    public boolean howl() {
        System.out.print("\nВоет - ");
        return false;
    }

    public boolean hunter() {
        System.out.print("\n\"охотитСЯ\" - ");
        return true;
    }
}
