package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex
{
    static Scanner sc = new Scanner(System.in);

    public static void firstName()
    {
        System.out.println("Enter First Name");
        String fN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }

    public static void lastName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Last Name");
        String lN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
    }


    public static void main(String[] args)
    {
        firstName();
        lastName();
    }
}
