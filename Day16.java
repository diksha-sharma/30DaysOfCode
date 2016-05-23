import java.util.Scanner;

/**
 * Created by diksha sharma on 5/19/2016.
 * Problem Statement: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
 */
public class Day16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try
        {
            int val = Integer.parseInt(input);
            System.out.println(val);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Bad String");
        }
    }
}
