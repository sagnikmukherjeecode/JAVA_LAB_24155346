package day3;

class day3prog3_Apple {
    void show() {
        System.out.println("Apple show()");
    }
}

class day3prog3_Banana extends day3prog3_Apple {
    void show() {
        System.out.println("Banana show()");
    }
}

class day3prog3_Cherry extends day3prog3_Apple {
    void show() {
        System.out.println("Cherry show()");
    }
}

class day3prog3_Main {
    public static void main(String[] args) {
        day3prog3_Apple ref;

        ref = new day3prog3_Apple();
        ref.show();

        ref = new day3prog3_Banana();
        ref.show();

        ref = new day3prog3_Cherry();
        ref.show();
    }
}
