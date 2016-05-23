import java.util.Scanner;

/**
 * Created by diksha sharma on 5/2/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-6-lets-review
 * https://www.hackerrank.com/challenges/30-review-loop
 */
public class Day6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iHeight = sc.nextInt();
        for(int i=1; i<= iHeight; i++)
        {
            for(int j= iHeight-1; j>=i ; j--)
            {
                System.out.print(" ");
            }
            for(int j= 0; j < i; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void second(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        sc.nextLine();
        for(int i=0; i< iCases; i++)
        {
            boolean bEven = true;
            String line = sc.nextLine();
            for(int j=0; j< line.length(); j++)
            {
                if(bEven == true && j%2 == 0)
                {
                    System.out.print(line.charAt(j));
                }
            }
            bEven = false;
            for(int j=0; j< line.length(); j++)
            {
                if(bEven == false && j%2 != 0)
                {
                    System.out.print(line.charAt(j));
                }
            }
        }
    }
}
