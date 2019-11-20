public class WolfTest {

    public static void main(String[] args) {
        final Wolf wolf = new Wolf();
        wolf.nameWolf = "\"Белый клык\"";
        wolf.genderWolf = "Самец";
        wolf.weightWolf = 64.5f;
        wolf.ageWolf = 7;
        wolf.colorWolf = "чёрно белого";
        System.out.println("\nПол волка: " + wolf.genderWolf);
        System.out.println("Кличка волка: " + wolf.nameWolf);
        System.out.println("ВеС волка: " + wolf.weightWolf + "кг.");
        System.out.println("ВозраСт волка: " + wolf.ageWolf + " лет");
        System.out.println("Волк: " + wolf.colorWolf + " окраСа\n");
        System.out.print(wolf.goWolf() + "\n");
        System.out.print(wolf.runWolf() + "\n");
        System.out.print(wolf.howlWolf() + "\n");
        System.out.print(wolf.hunterWolf());
    }
}

