package com.example.controlstatements;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int rev =0;
        int temp =n;
        while (n!=0)
        {
            int r= n%10;
            rev = (rev*10)+r;
            n= n/10;

        }
        if(temp==rev)
        {
            System.out.println(" The no is Pallindrome");

        }
        else
        {
            System.out.println("The no is not a Pallindrome");
        }

    }
}
