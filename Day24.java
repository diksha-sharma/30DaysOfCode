import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 5/27/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-linked-list-deletion
 */
public class Day24
{
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

    public static Node removeDuplicates(Node head)
    {
        if(head.next == null)
        {
            return head;
        }
        else if(head == null)
        {
            return null;
        }

        Node root = head;
        int data = 0;
        while(head.next != null)
        {
            if(head.data == head.next.data)
            {
                if(head.next.next != null)
                {
                    head.next = head.next.next;
                    data = head.data;
                    //head = head.next;
                }
                else
                {
                    head.next = null;
                }
            }
            else
            {
                head = head.next;
            }
        }

        if(data == head.data)
        {
            head.next = null;
        }

        return root;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
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
        int T=sc.nextInt();
        while(T-->0)
        {
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
