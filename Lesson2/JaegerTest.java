
public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        jaeger1.setName("\"Striker Eureka\"");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Austalia");
        jaeger1.setHeight(76.2);
        jaeger1.setWeight(1.850);
        jaeger1.setSpeed(10);
        jaeger1.setStrengdth(10);
        jaeger1.setArmor(9);
        jaeger1.setKaijuKilled(11);
        jaeger2.setName("\"Coyote Tango\"");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("Japan");
        jaeger2.setHeight(85.34);
        jaeger2.setWeight(2.312);
        jaeger2.setSpeed(0);
        jaeger2.setStrengdth(7);
        jaeger2.setArmor(4);
        jaeger2.setKaijuKilled(2);

        Jaeger[] jaegers = {jaeger1, jaeger2};
        for (Jaeger jaeger : jaegers) {
            System.out.println(jaeger);
            jaeger.isStateOnOff();
            jaeger.isDrift();
            jaeger.skanKaiju();
            jaeger.isCombatMode();
            jaeger.move();
        }
    }
}
