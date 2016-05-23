import java.util.Scanner;

/**
 * Created by diksha sharma on 5/2/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops
 * https://www.hackerrank.com/challenges/30-loops
 */
public class Day5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        looping(iCases);
        int a = 0;
        int b = 0;
        int N = 0;
        int answer = 0;
        for(int i=0; i< iCases; i++)
        {
            answer = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            N = sc.nextInt();
            answer = a + b;
            System.out.print(answer + " ");
            int power = 0;
            for(int j=1; j < N; j++)
            {
                power = 0;
                for(int k=0; k<= j; k++)
                {
                    power = power + (int)Math.pow(2, k) * b;
                }
                answer = a + power;
                System.out.print(answer + " ");
            }
            System.out.println();
        }
    }

    public static void looping(int iNum)
    {
        for(int i=1; i<= 10; i++)
        {
            System.out.println(iNum + " x "+ i +" = " + (iNum * i));
        }
    }
}
