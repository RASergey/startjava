public class WolfTest {

    public static void main(String[] args) {
        final Wolf wolf = new Wolf();
        wolf.name = "\"Белый клык\"";
        wolf.gender = "Самец";
        wolf.weight = 64.5f;
        wolf.age = 7;
        wolf.color = "чёрно белого";
        System.out.println("\nПол волка: " + wolf.gender);
        System.out.println("Кличка волка: " + wolf.name);
        System.out.println("ВеС волка: " + wolf.weight + "кг.");
        System.out.println("ВозраСт волка: " + wolf.age + " лет");
        System.out.println("Волк: " + wolf.color + " окраСа\n");
        System.out.print(wolf.go() + "\n");
        System.out.print(wolf.run() + "\n");
        System.out.print(wolf.howl() + "\n");
        System.out.print(wolf.hunter());
    }
}

