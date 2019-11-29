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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrengdth() {
        return strengdth;
    }

    public void setStrengdth(int strengdth) {
        this.strengdth = strengdth;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public boolean isStateOnOff() {
        System.out.println(getName() + ": Jaeger активирован");
        return true;
    }

    public void move() {
        if (speed == 0) {
            System.out.println(getName() + ": Стою на меcте");
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
        System.out.println(getName() + ": Пилоты подключены. Включён режим \"Drift\"");
        return true;
    }

    public String toString() {
        return "\nName: " + name + " \\ " + mark + "\nOrigin: " + origin + "\nHeight: " + height + "m." + "\nWeight: " + weight + "t." + "\nSpeed: " + speed + "\nStrengdth: " + strengdth + "\nArmor: " + armor + "\nKaijuKilled: " + kaijuKilled + "\n";
    }
}
