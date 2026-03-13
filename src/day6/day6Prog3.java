package day6;

import java.util.*;

class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }
}

public class day6Prog3 {

    static void ProcessInput(int n) throws NegativeNumberException
    {
        if(n<0)
            throw new NegativeNumberException("number should be positive");
        else
            System.out.println("Double value: "+(n*2));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try{
            ProcessInput(n);
        }
        catch(NegativeNumberException e){
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: "+e);
        }
    }
}