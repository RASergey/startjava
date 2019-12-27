package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String name;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strengdth;
    private int armor;
    private int kaijuKilled;

    public Jaeger(String name, String mark, String origin, double height, double weight, int speed, int strengdth, int armor, int kaijuKilled) {
        this.name = name;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strengdth = strengdth;
        this.armor = armor;
        this.kaijuKilled = kaijuKilled;
    }

    public String getName() {
        return name;
    }

    public boolean isStateOnOff() {
        System.out.println(getName() + ": Jaeger активирован");
        return true;
    }

    public void move() {
        if (speed == 0) {
            System.out.println(getName() + ": Стою на меСте");
        } else if (speed > 0) {
            System.out.println(getName() + ": Движение к цели...");
        }
    }

    public void skanKaiju() {
        System.out.println(getName() + ": Сканирование территории");
    }

    public boolean isCombatMode() {
        System.out.println(getName() + ": Боевой режим включён");
        return true;
    }

    public boolean isDrift() {
        System.out.println(getName() + ": Оба пилота подключены. Включён режим \"Drift\"");
        return true;
    }

    public String toString() {
        return "\nName: " + name + " \\ " + mark + "\nOrigin: " + origin + "\nHeight: " + height + "m." + "\nWeight: " + weight + "t." + "\nSpeed: " + speed + "\nStrengdth: " + strengdth + "\nArmor: " + armor + "\nKaijuKilled: " + kaijuKilled + "\n";
    }
}
