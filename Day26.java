import com.sun.org.apache.bcel.internal.generic.DMUL;

import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 5/29/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-nested-logic
 */
public class Day26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rDay = sc.nextInt();
        int rMonth = sc.nextInt();
        int rYear = sc.nextInt();
        int dDay = sc.nextInt();
        int dMonth = sc.nextInt();
        int dYear = sc.nextInt();
        int fine = 0;

        if(rYear > dYear)
        {
            fine = 10000;
            System.out.println(fine);
        }
        else
        {
            if(rMonth > dMonth)
            {
                fine = Math.abs(500 * (dMonth - rMonth));
                System.out.println(fine);
            }
            else
            {
                if(rDay > dDay)
                {
                    fine = Math.abs(15 * (dDay - rDay));
                    System.out.println(fine);
                }
                else
                {
                    fine = 0;
                    System.out.println(fine);
                }
            }
        }
    }
}
