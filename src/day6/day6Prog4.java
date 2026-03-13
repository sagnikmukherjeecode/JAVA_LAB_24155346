package day6;

import java.util.*;

class HrsException extends Exception{
    HrsException(String msg){
        super(msg);
    }
}

class MinException extends Exception{
    MinException(String msg){
        super(msg);
    }
}

class SecException extends Exception{
    SecException(String msg){
        super(msg);
    }
}

class Time{

    int hours,minutes,seconds;

    void setTime(int h,int m,int s) throws HrsException,MinException,SecException
    {
        if(h>24 || h<0)
            throw new HrsException("hour is not greater than 24");

        if(m>60 || m<0)
            throw new MinException("minute is not greater than 60");

        if(s>60 || s<0)
            throw new SecException("second is not greater than 60");

        System.out.println("Correct Time-> "+h+":"+m+":"+s);
    }
}

public class day6Prog4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        try{
            System.out.print("Enter hours: ");
            int h = sc.nextInt();

            System.out.print("Enter minutes: ");
            int m = sc.nextInt();

            System.out.print("Enter seconds: ");
            int s = sc.nextInt();

            t.setTime(h,m,s);
        }
        catch(Exception e){
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: "+e);
        }
    }
}