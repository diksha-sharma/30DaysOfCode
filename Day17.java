import com.sun.rmi.rmid.ExecPermission;

import java.util.*;
import java.io.*;

/**
 * Created by diksha sharma on 5/20/2016.
 * Problem Statement: https://www.hackerrank.com/challenges/30-more-exceptions
 */
public class Day17
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static class Calculator
    {
        public int power(int n, int p) throws Exception
        {
            if(n < 0 || p < 0)
            {
                throw new Exception("n and p should be non-negative");
            }
            else
            {
                return (int)Math.pow(n, p);
            }
        }
    }
}
