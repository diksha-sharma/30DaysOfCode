import java.util.*;
import java.io.*;

/**
 * Created by diksha sharma on 5/22/2016.
 * Problem Statement:
 */

interface AdvancedArithmetic
{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{
    @Override
    public int divisorSum(int n)
    {
        int sum = 1;
        for(int i=2; i<= n; i++)
        {
            if(n%i == 0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
}

public class Day19
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
