package day5;

import java.util.Scanner;

public class day5Prog2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
        {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Change case of a string");
            System.out.println("2. Reverse a string");
            System.out.println("3. Compare two strings (ASCII difference)");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert string to upper/lower case");
            System.out.println("6. Search character in string");
            System.out.println("7. Check palindrome");
            System.out.println("8. Count words, vowels, consonants");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter a string: ");
                    String s1 = sc.nextLine();
                    System.out.println("After changing case: " + s1.toUpperCase());
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String s2 = sc.nextLine();
                    System.out.println("Reversed string: " + new StringBuilder(s2).reverse());
                    break;

                case 3:
                    System.out.print("Enter first string: ");
                    String str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = sc.nextLine();
                    int diff = 0;
                    int len = Math.min(str1.length(), str2.length());
                    for (int i = 0; i < len; i++)
                        diff += Math.abs(str1.charAt(i) - str2.charAt(i));
                    System.out.println("ASCII difference: " + diff);
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String base = sc.nextLine();
                    System.out.print("Enter string to insert: ");
                    String insert = sc.nextLine();
                    System.out.println("After insertion: " + base + " " + insert);
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String s3 = sc.nextLine();
                    System.out.println("Uppercase: " + s3.toUpperCase());
                    System.out.println("Lowercase: " + s3.toLowerCase());
                    break;

                case 6:
                    System.out.print("Enter a string: ");
                    String s4 = sc.nextLine();
                    System.out.print("Enter character to search: ");
                    char ch = sc.next().charAt(0);
                    int pos = s4.indexOf(ch);
                    if (pos >= 0)
                        System.out.println("Character found at position: " + pos);
                    else
                        System.out.println("Character not present");
                    sc.nextLine();
                    break;

                case 7:
                    System.out.print("Enter a string: ");
                    String s5 = sc.nextLine();
                    String rev = new StringBuilder(s5).reverse().toString();
                    if (s5.equals(rev))
                        System.out.println("String is palindrome");
                    else
                        System.out.println("String is not palindrome");
                    break;

                case 8:
                    System.out.print("Enter a string: ");
                    String s6 = sc.nextLine();
                    int words = s6.split("\\s+").length;
                    int vowels = 0, cons = 0;
                    for (char c : s6.toLowerCase().toCharArray())
                    {
                        if (c >= 'a' && c <= 'z')
                        {
                            if ("aeiou".indexOf(c) != -1)
                                vowels++;
                            else
                                cons++;
                        }
                    }
                    System.out.println("No. of words: " + words);
                    System.out.println("No. of vowels: " + vowels);
                    System.out.println("No. of consonants: " + cons);
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
