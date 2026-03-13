package day7;

import java.util.*;
import java.io.*;

public class day7Prog1 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rollno:");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Subject:");
        String sub = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        System.out.println("Enter file name:");
        String file = sc.next();

        FileWriter fw = new FileWriter(file,true);

        fw.write(roll+" "+name+" "+sub+" "+marks+"\n");

        fw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }

        br.close();
    }
}