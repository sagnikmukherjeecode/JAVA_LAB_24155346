package day7;

import java.io.*;
import java.util.*;

public class day7Prog2 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source file:");
        String source = sc.nextLine();

        System.out.println("Enter destination file:");
        String dest = sc.nextLine();

        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(dest);

        int ch;

        while((ch=fr.read())!=-1)
        {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File Copied");
    }
}