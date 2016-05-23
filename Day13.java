import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-13-abstract-classes
 */
public class Day13
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }

    static abstract class Book
    {
        String title;
        String author;
        Book(String t,String a)
        {
            title=t;
            author=a;
        }
        abstract void display();
    }

    static class MyBook extends Book
    {
        int price;
        MyBook(String t, String a, int i)
        {
            super(t,a);
            price = i;
        }

        void display()
        {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
}
