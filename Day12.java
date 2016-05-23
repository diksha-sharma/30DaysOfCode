import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by diksha sharma on 5/3/2016.
 * Problem Statement: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-12-inheritance
 * https://www.hackerrank.com/challenges/30-inheritance
 */
public class Day12
{
    /*class Student
    {
        protected String firstName;
        protected String lastName;
        int phone;
        Student()
        {
            //default constructor
        }

        Student(String fname,String lname,int p)
        {
            firstName=fname;
            lastName=lname;
            phone=p;

        }
        public void display()
        {
            // display the details of the student
            System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone);
        }
    }*/

    /*class Grade extends Student
    {
        private int score;
        public Grade(String fName,String lName,int phone,int s)
        {
            super(fName, lName, phone);
            score = s;
        }

        public char calculate()
        {
            if(score < 40)
            {
                return 'D';
            }
            else if(score >= 40 && score < 60)
            {
                return 'B';
            }
            else if(score >= 60 && score < 75)
            {
                return 'A';
            }
            else if(score >= 75 && score < 90)
            {
                return 'E';
            }
            else
            {
                return 'O';
            }
        }
    }*/

    class Student extends Person
    {
        private int[] testScores;
        Student(String firstName, String lastName, int idNumber, int[] scores)
        {
            //default constructor
            super(firstName,lastName,idNumber);
            testScores = scores;
        }

        public void calculate()
        {
            int avg = 0;
            for(int i=0; i< testScores.length; i++)
            {
                avg = avg + testScores[i];
            }
            avg = avg/testScores.length;
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("ID: " + idNumber);
            System.out.print("Grade: ");

            if(avg <= 100 && avg >= 90)
            {
                System.out.print("O");
            }
            else if(avg < 90 && avg >= 80)
            {
                System.out.print("E");
            }
            else if(avg < 80 && avg >= 70)
            {
                System.out.print("A");
            }
            else if(avg < 70 && avg >= 55)
            {
                System.out.print("P");
            }
            else if(avg < 55 && avg >= 40)
            {
                System.out.print("D");
            }
            else if(avg < 40)
            {
                System.out.print("T");
            }
        }
    }

    class Person
    {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        Person()
        {
            //default constructor
        }

        // Constructor
        Person(String firstName, String lastName, int identification)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson()
        {
            System.out.println("Name: " + lastName + ", " + firstName + 	"\nID: " + idNumber);
        }
    }
}