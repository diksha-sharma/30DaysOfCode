import java.util.*;
import java.io.*;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Diksha Sharma on 5/24/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-generics
 */
public class Day21
{
    public static void main(String args[])
    {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray(intArray);
        printArray(stringArray);

        if(Day21.class.getDeclaredMethods().length > 2)
        {
            System.out.println("You should only have 1 method named printArray.");
        }
    }

    public static void printArray(Object[] x)
    {
        for(int i=0; i< x.length; i++)
        {
            System.out.println(x[i]);
        }
    }
}
