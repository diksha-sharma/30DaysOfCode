import java.util.*;
import java.io.*;

/**
 * Created by diksha sharma on 5/23/2016.
 * Problem Statement: https://www.hackerrank.com/challenges/30-sorting
 */
public class Day20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i< size; i++)
        {
            arr[i] = sc.nextInt();
        }

        int exchanges = 0;
        int swaps = 0;
        int temp = 0;
        for(int i=0; i< size; i++)
        {
            exchanges = 0;
            for(int j=0; j < (size-1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    exchanges++;
                    swaps++;
                }
            }
            if(exchanges == 0)
            {
                break;
            }
        }

        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[size-1]);
    }
}
