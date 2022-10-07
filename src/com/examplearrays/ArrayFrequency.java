package com.examplearrays;

import javax.sql.rowset.spi.SyncProvider;
import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total elements in array");
        int a = sc.nextInt();
        int arr[] = new int[5];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        //int count=0;
        for (int i = 0; i < 5; i++) {
            int count = 1;
            for (int j = i + 1; i < 5; i++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println("frequency:" + count);

                }

            }
        }
    }
}
