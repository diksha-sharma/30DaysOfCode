import java.util.Scanner;

/**
 * Created by diksha sharma on 5/2/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-2-arithmetic
 */
public class Day2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage
        double tip = M * T /100;
        double tax = X * M /100;
        double finalPrice = tip + tax + M;
        int total = (int) Math.round(finalPrice);
        System.out.println("The final price of the meal is $" + total + ".");
    }
}
