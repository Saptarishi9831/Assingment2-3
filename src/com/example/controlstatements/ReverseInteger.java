package com.example.controlstatements;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number you want to reverse");
        int n= sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            //n=n/10;
            int r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
     System.out.println("The reverse of the entered no. is:" + rev);
    }

}
