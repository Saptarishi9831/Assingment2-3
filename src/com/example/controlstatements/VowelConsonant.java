package com.example.controlstatements;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vowel or Consonant");
        char c= sc.next().charAt(0);
        switch (c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + "is a vowel");
                break;
            default:
                System.out.println(c + "is a consonant");
        }
    }
}
