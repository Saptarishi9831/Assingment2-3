package com.examplearrays;

import java.util.Scanner;

public class ArrayLarge {
    public static void main(String[] args)
    {
        int arr[] =new int[5];
        int l= arr.length, large=arr[0];
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
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println("The largest element in the array is:" + large);
    }
}
