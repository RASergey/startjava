class Person {

    String name = "Джонни";
    char gender = 'M';
    float height = 177.5f;
    float weight = 83.7f;
    byte age = 30;
    int speed = 5;

    String speak() {
        if (speed > 0 && speed <= 8) {
            return "Я Сейчаc гуляю по парку!";
        } else if (speed >= 9) {
            return "Я Сейчаc бегаю!";
        } else {
            return "Я сижу в парке на лавочке";
        }
    }

    boolean sit() {
        System.out.println("Вы приcели");
        return (speed < 0);
    }

    boolean go() {
        System.out.println("Вы идёте");
        return (speed > 0 && speed <= 8);
    }

    boolean run() {
        System.out.println("Вы бежите");
        return (speed >= 9);
    }

    void study() {
        if (speed <= 8) {
            System.out.println("Изучаю Java");
        }
    }
}
