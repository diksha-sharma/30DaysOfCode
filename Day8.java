import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by diksha sharma on 5/2/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-8-dictionaries-and-maps
 */
public class Day8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> directory = new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.next();
            int phone=in.nextInt();
            in.nextLine();
            directory.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(directory.containsKey(s))
            {
                System.out.println(s+"="+directory.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}