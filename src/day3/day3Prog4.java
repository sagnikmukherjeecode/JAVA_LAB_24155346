package day3;

import java.util.Scanner;

class day3prog4_Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no + " Balance: " + balance);
    }
}

class day3prog4_Person extends day3prog4_Account {
    String name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter Aadhar No: ");
        aadhar_no = sc.next();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name + " Aadhar No: " + aadhar_no);
    }
}

class day3prog4_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        day3prog4_Person[] persons = new day3prog4_Person[3];
        for (int i = 0; i < 3; i++) {
            persons[i] = new day3prog4_Person();
            System.out.println("Enter details of person " + (i + 1));
            persons[i].input(sc);
        }
        System.out.println("Details of persons:");
        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }
    }
}
