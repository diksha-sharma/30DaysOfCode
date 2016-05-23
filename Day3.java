import java.util.Scanner;

/**
 * Created by diksha sharma on 5/2/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-3-if-statements
 */
public class Day3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iN = sc.nextInt();

        if(iN%2 != 0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(iN >=2 && iN <= 5)
            {
                System.out.println("Not Weird");
            }
            else if(iN >=6 && iN <= 20)
            {
                System.out.println("Weird");
            }
            else if(iN > 20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}
