package day6;
import java.util.*;

public class day6Prog1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[4];
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<5;i++)
            {
                arr[i] = sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}