package day5;

import java.util.Scanner;
import day5.Marketing.Sales;

public class day5Prog1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        double basic = sc.nextDouble();

        Sales s = new Sales(id, name, basic);

        double total = s.earnings() + s.tallowance();

        System.out.println("The emp id of the employee is " + id);
        System.out.println("The total earning is " + total);
    }
}
