import java.util.*;
import java.io.*;

/**
 * Created by Diksha Sharma on 5/26/2016.
 * Contact: diksha2207@gmail.com
 * Problem Statement: https://www.hackerrank.com/challenges/30-binary-trees
 */
public class Day23
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

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    static void levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            Node curr = q.remove();

            if(curr.left != null)
            {
                q.add(curr.left);
            }

            if(curr.right != null)
            {
                q.add(curr.right);
            }

            System.out.print(curr.data + " ");
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
        levelOrder(root);
    }
}
