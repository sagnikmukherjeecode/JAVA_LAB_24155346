package day3;

import java.util.Scanner;

class day3prog1_2D {
    double length, width;
    double costPerSqFt = 40;

    day3prog1_2D(double l, double w) {
        length = l;
        width = w;
    }

    double calculateCost() {
        return length * width * costPerSqFt;
    }
}

class day3prog1_3D extends day3prog1_2D {
    double height;
    double costPerCubicFt = 60;

    day3prog1_3D(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    double calculateCost() {
        return length * width * height * costPerCubicFt;
    }
}

class day3prog1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width for sheet:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        day3prog1_2D sheet = new day3prog1_2D(l, w);
        System.out.println("Cost of sheet: Rs " + sheet.calculateCost());

        System.out.println("Enter length, width and height for box:");
        l = sc.nextDouble();
        w = sc.nextDouble();
        double h = sc.nextDouble();
        day3prog1_3D box = new day3prog1_3D(l, w, h);
        System.out.println("Cost of box: Rs " + box.calculateCost());
    }
}
