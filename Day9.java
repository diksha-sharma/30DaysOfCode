import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-9-recursion
 * https://www.hackerrank.com/challenges/30-recursion
 */
public class Day9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
        if(a<1)
        {
            System.out.println(0);
        }
        else if(a==1)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(factorial(a));
        }
    }
    static  int find_gcd(int a,int b)
    {
        if(a < b)
        {
            return find_gcd(a,b%a);
        }
        else if(b == 0)
        {
            return 0;
        }
        else if (a%b == 0)
        {
            return b;
        }
        else
        {
            return find_gcd(b,a%b);
        }
    }

    public static long factorial(long a)
    {
        if(a==2)
        {
            return 2;
        }
        else
        {
            long f = a * factorial(a-1);
            return f;
        }
    }
}