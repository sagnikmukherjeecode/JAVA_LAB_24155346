package day2;

import java.util.*;
public class day2Prog1 {
    public void evenOrOdd(int n)
    {
        if(n%2==0)
                System.out.println(n+" is Even");
        else
            System.out.println(n+" is Odd");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int a[]= new int[10];
        for(int i=0;i<10;i++) {
            a[i]=sc.nextInt();
        }
        day2Prog1 ob=new day2Prog1();
        for(int i=0;i<10;i++)
            ob.evenOrOdd(a[i]);
    }
}
