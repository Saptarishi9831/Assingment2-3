package com.example.controlstatements;
import java.util.Scanner;

public class ForLoop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
        }
     System.out.println("The sum of first n natural nos is:" + sum);
    }
}
