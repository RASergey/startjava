public class UpWolfTest {

    public static void main(String[] args) {
        UpWolf wolf = new UpWolf();
        wolf.setName("Одиночка");
        wolf.setColor("Серого");
        wolf.setGender("Самец");
        wolf.setAge(7);
        wolf.setWeight(25.7);
        System.out.println(wolf);
        System.out.print(wolf.isGo() + "\n");
        System.out.print(wolf.isRun() + "\n");
        System.out.print(wolf.isHowl() + "\n");
        System.out.print(wolf.isHunter());
    }
}
