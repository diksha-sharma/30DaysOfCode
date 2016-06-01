import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 5/25/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-binary-search-trees
 */
public class Day22
{
    static class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public static int getHeight(Node root)
    {
        int leftHeight = -1;
        int rightHeight = -1;
        if(root.left != null)
        {
            leftHeight = getHeight(root.left);
        }

        if(root.right != null)
        {
            rightHeight = getHeight(root.right);
        }

        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    public static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        else
        {
            Node cur;
            if(data<=root.data)
            {
                cur=insert(root.left,data);
                root.left=cur;
            }
            else
            {
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0)
        {
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
