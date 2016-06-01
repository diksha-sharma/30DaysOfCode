import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Diksha Sharma on 5/31/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement:
 */
public class Day28
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Pattern p = Pattern.compile("@gmail.com$");
        Matcher m;
        ArrayList<String> names = new ArrayList<>();
        for(int a0 = 0; a0 < N; a0++)
        {
            String firstName = in.next();
            String emailID = in.next();
            m = p.matcher(emailID);
            if(m.find())
            {
                names.add(firstName);
            }
        }

        Collections.sort(names);
        for(int i=0; i< names.size(); i++)
        {
            System.out.println(names.get(i));
        }
    }
}
