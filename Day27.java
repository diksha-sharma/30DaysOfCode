import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 5/30/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-testing
 */
public class Day27
{
    public static void main(String[] args)
    {
        System.out.println("5");
        System.out.println("4 3");
        System.out.println("2 0 -1 2");
        System.out.println("5 2");
        System.out.println(" 0 -1 2 1 3");
        System.out.println("6 4");
        System.out.println("0 -1 -2 3 4 5");
        System.out.println("5 3");
        System.out.println("-1 -2 0 2 3");
        System.out.println("10 4");
        System.out.println("-1 -2 0 2 3 4 5 7 8 6");

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i=0; i< cases; i++)
        {
            int iStudents = sc.nextInt();
            int iMinStudents = sc.nextInt();
            int count = 0;
            for(int j=0; j< iStudents; j++)
            {
                int entryTime = sc.nextInt();
                if(entryTime <= 0)
                {
                    count++;
                }
            }
            if(count >= iMinStudents)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}
