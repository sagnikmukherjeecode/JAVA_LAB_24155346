import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void displayArea() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

public class day2Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle r1 = new Rectangle();
        r1.displayArea();

        // Using parameterized constructor
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        Rectangle r2 = new Rectangle(l, b);
        r2.displayArea();

        sc.close();
    }
}
