import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-14-scope-and-imports
 */
public class Day14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++)
        {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }

    static class Difference
    {
        private int[] elements;
        public int maximumDifference;
        Difference(int[] arr)
        {
            elements = arr;
        }

        void computeDifference()
        {
            int iMaxDiff = 0;
            int diff = 0;
            for(int i=0; i< elements.length; i++)
            {
                for(int j=0; j< elements.length; j++)
                {
                    diff = Math.abs(elements[i] - elements[j]);
                    if(iMaxDiff < diff)
                    {
                        iMaxDiff = diff;
                    }
                }
            }
            maximumDifference = iMaxDiff;
        }
    }
}