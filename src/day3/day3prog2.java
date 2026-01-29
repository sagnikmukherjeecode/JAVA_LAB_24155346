package day3;

import java.util.Scanner;

class day3prog2_plate {/**/
    double length, width;
    day3prog2_plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor: length=" + length + " width=" + width);
    }
}

class day3prog2_box extends day3prog2_plate {
    double height;
    day3prog2_box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box constructor: length=" + length + " width=" + width + " height=" + height);
    }
}

class day3prog2_woodbox extends day3prog2_box {
    double thick;
    day3prog2_woodbox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox constructor: length=" + length + " width=" + width + " height=" + height + " thick=" + thick);
    }
}

class day3prog2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, height, thickness:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();
        day3prog2_woodbox wb = new day3prog2_woodbox(l, w, h, t);
    }
}

