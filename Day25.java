import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 5/28/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-running-time-and-complexity
 */
public class Day25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Cases = sc.nextInt();

        for(int j=0; j< Cases; j++)
        {
            int iN = sc.nextInt();
            int iLimit = (int)Math.sqrt(iN);
            boolean bPrime = true;
            if(iN == 1)
            {
                System.out.println("Not prime");
                bPrime = false;
            }
            else
            {
                for(int i=2; i<= iLimit; i++ )
                {
                    if(iN%i == 0)
                    {
                        System.out.println("Not prime");
                        bPrime = false;
                        break;
                    }
                }

                if(bPrime == true)
                {
                    System.out.println("Prime");
                }
            }
        }
    }
}
