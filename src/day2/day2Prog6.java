package day2;

class Calculator {
    void subtract(int a, int b) {
        System.out.println(a - b);
    }

    void subtract(int a, int b, int c) {
        System.out.println(a - b - c);
    }

    void subtract(double a, double b) {
        System.out.println(a - b);
    }

    void subtract(double a, int b) {
        System.out.println(a - b);
    }
}

public class day2Prog6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.subtract(10, 5);
        calc.subtract(20, 5, 3);
        calc.subtract(15.5, 4.5);
        calc.subtract(12.5, 5);
    }
}
