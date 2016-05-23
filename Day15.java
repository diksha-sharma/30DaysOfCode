import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-15-linked-list
 */
public class Day15
{
    public static Node insert(Node head,int data)
    {
        if(head != null)
        {
            Node temp = head;
            while(temp.next!= null)
            {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            return head;
        }
        else
        {
            Node newNode = new Node(data);
            return newNode;
        }
    }

    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int N=sc.nextInt();
        while(N-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        display(head);

    }

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
}