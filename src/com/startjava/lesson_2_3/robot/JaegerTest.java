package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("\"Striker Eureka\"", "Mark-5", "Australia", 76.2, 1.850, 10, 10, 9, 11);
        Jaeger jaeger2 = new Jaeger("\"Coyote Tango\"", "Mark-1", "Japan", 85.34, 2.312, 0, 7, 4, 2);

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
