import java.util.Scanner;

// Class Rectangle
class Rectangle {

    // Data members
    double length, breadth;
    double area, perimeter;

    // Method to read length and breadth
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display result
    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

// Application class
public class day2Prog4 {
    public static void main(String[] args) {

        // Create object of Rectangle class
        Rectangle r = new Rectangle();

        // Call methods
        r.read();
        r.calculate();
        r.display();
    }
}
