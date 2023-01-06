package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex
{
    static Scanner sc = new Scanner(System.in);

    public static void userFullName()
    {
        System.out.println("Enter First Name");
        String fN = sc.nextLine();

        System.out.println("\nEnter Last Name");
        String lN = sc.nextLine();

        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
        {
            if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
                System.out.println("Valid User Name");
        }
        else
            System.out.println("Invalid User Name");
    }
    public static void email()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Email");
        String email = sc.nextLine();
        if (Pattern.matches("^[a-z]{1,}[._+-]?[a-z]{1,}?[\\@][a-z]{1,}[\\.][a-z]{1,}[\\.][a-z]{1,}$",email) == true)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
    public static void main(String[] args)
    {
        userFullName();
        email();
    }
}
