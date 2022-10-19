package com.examplearrays;

import java.util.Scanner;

public class ArrayAscending {
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int l = arr.length;
        int temp;
        System.out.println("Enter the no. of elements in the array:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are:");
        for (int i = 0; i < l; i++) {
            //System.out.println("The elements are:");
            System.out.println(arr[i]);
        }
        //System.out.println("The elements in the ascending order are:");
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                   // System.out.println(arr[i]);

                }
            }
        }

        System.out.println("The elements in the ascending order are:");
        for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
