package day2;

// Program to find number of objects created using static modifier
class day2prog2 {

    // Static variable shared by all objects of the class
    static int count = 0;

    // Constructor: called every time an object is created
    day2prog2() {
        count++;    // Increment count for each object created
    }

    public static void main(String[] args) {

        // Creating objects of the class
        day2prog2 ob1 = new day2prog2();
        day2prog2 ob2 = new day2prog2();
        day2prog2 ob3 = new day2prog2();

        // Displaying total number of objects created
        // Static variable is accessed using class name
        System.out.println("No of objects = " + day2prog2.count);
    }
}

