public class UpWolf {

    private String name;
    private String gender;
    private String color;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") {
            this.name = "ПуСтаЯ Строка";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            this.age = age;
            System.out.println("\n" + this.age + " лет - некорректный возраСт\n");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "") {
            this.color = "ПуСтаЯ Строка";
        } else {
            this.color = color;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "") {
            this.gender = "ПуСтаЯ Строка";
        } else {
            this.gender = gender;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 5) {
            this.weight = weight;
            System.out.println("\n" + this.weight + "кг. - некорректный веC\n");
        } else {
            this.weight = weight;
        }
    }

    public boolean isGo() {
        System.out.print("Идёт - ");
        return false;
    }

    public boolean isRun() {
        System.out.print("\nБежит - ");
        return true;
    }

    public boolean isHowl() {
        System.out.print("\nВоет - ");
        return false;
    }

    public boolean isHunter() {
        System.out.print("\nохотитСЯ - ");
        return true;
    }

    public String toString() {
        return "Кличка волка: " + getName() + "\nПол волка: " + getGender() + "\nВолк: " + getColor() + " окраСа" + "\nВозраСт волка: " + getAge() + " лет" + "\nВеС волка: " + getWeight() + "кг.\n";
    }
}
