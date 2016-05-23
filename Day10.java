import java.util.Scanner;
import java.util.function.IntBinaryOperator;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-10-binary-numbers
 * https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class Day10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        for(int i=0; i< N; i++)
        {
            num = sc.nextInt();
            System.out.println(Integer.toBinaryString(num));
        }
        int inum = sc.nextInt();
        String sNum = Integer.toBinaryString(inum);
        int count = 0;
        boolean bOne = false;
        int maxCount = 0;
        for(int i=0; i< sNum.length(); i++)
        {
            if(sNum.charAt(i) == '1')
            {
                bOne = true;
                count++;
                if(maxCount < count)
                {
                    maxCount = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        count = maxCount;
        System.out.println(count);
    }
}
