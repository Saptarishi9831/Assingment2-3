package com.example.controlstatements;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the sum");
        int n = sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
      System.out.println("The sum of natural no's" + sum);
    }
}
