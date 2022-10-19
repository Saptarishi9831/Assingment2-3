package com.examplearrays;

import java.util.Scanner;

public class ArrayOdd {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int l = arr.length;
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
        System.out.println("The elements in the odd position are:");
        for (int i = 0; i < l; i++) {
            //System.out.println("The elements in the odd position are:");
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }

        }
    }
}
