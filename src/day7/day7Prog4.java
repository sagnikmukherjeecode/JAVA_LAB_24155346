package day7;

import java.io.*;
import java.util.*;

public class day7Prog4 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        String file = sc.nextLine();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int charCount=0,wordCount=0,lineCount=0;

        String line;

        while((line=br.readLine())!=null)
        {
            lineCount++;

            charCount += line.length();

            String words[] = line.split("\\s+");

            wordCount += words.length;
        }

        System.out.println("No. of characters - "+charCount);
        System.out.println("No. of lines - "+lineCount);
        System.out.println("No. of words - "+wordCount);

        br.close();
    }
}