import java.util.Scanner;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-11-more-review
 */
public class Day11
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int k=0; k < 4; k++) //for rows
        {
            for(int i=0; i < 4; i++) //for columns
            {
                sum =0;
                for(int j=i; j <= i+2; j++) //row 1 of hourglass
                {
                    sum = sum + arr[k][j];
                }
                sum = sum + arr[k+1][i+1]; //row 2 of hourglass
                for(int j=i; j <= i+2; j++) //row 3 of hourglass
                {
                    sum = sum + arr[k+2][j];
                }
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
