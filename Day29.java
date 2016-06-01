import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 6/1/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-bitwise-and
 */
public class Day29
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            if(n <= k)
            {
                System.out.println(0);
            }
            else
            {
                int max = Integer.MIN_VALUE;
                for(int i=1; i< n; i++)
                {
                    for(int j=i+1; j<= n; j++)
                    {
                        if((i & j) < k)
                        {
                            int temp = i & j;
                            if(temp > max)
                            {
                                max = temp;
                            }
                        }
                    }
                }
                System.out.println(max);
            }
        }
    }
}
