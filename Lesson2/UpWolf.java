public class UpWolf {

    private String genderWolf = "Самец";
    private String nameWolf = "\"Белый клык\"";
    private float weightWolf = 64.5f;
    private int ageWolf = 7;
    private String colorWolf = "чёрно белого";



    public String getNameWolf() {
        return nameWolf;
    }
    public String getGenderWolf() {
        return genderWolf;
    }
    public float getWeightWolf() {
        return weightWolf;
    }
    public int getAgeWolf() {
        return ageWolf;
    }
    public String getColorWolf() {
        return colorWolf;
    }

    public void setNameWolf(String nameWolf) {
        if (nameWolf == "") {
            this.nameWolf = "ПуСтаЯ Строка";
        } else {
            this.nameWolf = nameWolf;
        }
    }
    public void setAgeWolf(int ageWolf) {
        if (ageWolf > 8) {
            this.ageWolf = ageWolf;
            System.out.println("\n" + this.ageWolf + " лет - некорректный возраСт");
        } else {
            this.ageWolf = ageWolf;
        }
    }
    public void setColorWolf(String colorWolf) {
        if (colorWolf == "") {
            this.colorWolf = "ПуСтаЯ Строка";
        } else {
            this.colorWolf = colorWolf;
        }
    }

    public boolean goWolf() {
        System.out.print("Идёт - ");
        return false;
    }

    public boolean runWolf() {
        System.out.print("\nБежит - ");
        return true;
    }

    public boolean howlWolf() {
        System.out.print("\nВоет - ");
        return false;
    }

    public boolean hunterWolf() {
        System.out.print("\nохотитСЯ - ");
        return true;
    }

    public void showWolf(){
        System.out.println("\nПол волка: " + getGenderWolf());
        System.out.println("Кличка волка: " + getNameWolf());
        System.out.println("ВеС волка: " + getWeightWolf() + "кг.");
        System.out.println("ВозраСт волка: " + getAgeWolf() + " лет");
        System.out.println("Волк: " + getColorWolf() + " окраСа\n");
        System.out.print(goWolf() + "\n");
        System.out.print(runWolf() + "\n");
        System.out.print(howlWolf() + "\n");
        System.out.print(hunterWolf());
    }
}
