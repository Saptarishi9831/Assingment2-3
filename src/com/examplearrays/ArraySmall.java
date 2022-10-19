package com.examplearrays;

import java.util.Scanner;

public class ArraySmall
{
    public static void main(String[]args)
    {
        int arr[] =new int[5];
        int l= arr.length, small=arr[0];
        System.out.println("Enter the no. of elements in the array:");
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<l;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("The elements are:");
        for(int i=0;i<l;i++)
        {
            //System.out.println("The elements are:");
            System.out.println(arr[i]);
        }
        for(int i=0;i<l;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        System.out.println("The smallest element in tha array is:" + small);
    }
}

