import java.util.*;
import java.io.*;

/**
 * Created by diksha sharma on 5/21/2016.
 * Problem Statement:
 */
public class Day18
{
    public static Stack<Character> st = new Stack<>();
    public static char[] q = new char[10];
    public static int index = -1;

    public static void pushCharacter(char c)
    {
        st.push(c);
    }

    public static void enqueueCharacter(char c)
    {
        if(index < (q.length+1))
        {
            index++;
            q[index] = c;
        }
    }

    public static char popCharacter()
    {
        return st.pop();
    }

    public static char dequeueCharacter()
    {
        char temp = q[0];
        for(int i=1; i< index; i++)
        {
            q[i-1] = q[i];
        }
        index--;
        return temp;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Day18 object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s)
        {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++)
        {
            if (p.popCharacter() != p.dequeueCharacter())
            {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
