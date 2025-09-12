package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

import java.util.Scanner;

public class ThreeStrings {

    public static void main(String[] args) {
        String s1;
        String s2;
        String s3;
        Scanner sc = new Scanner(System.in);
        System.out.print("First string? ");
        s1 = sc.nextLine();
        System.out.print("Second string? ");
        s2 = sc.nextLine();
        System.out.print("Third string? ");
        s3 = sc.nextLine();
        if (s3.compareTo(s1+s2) == 0) {
            System.out.printf("%s + %s is equal to %s", s1, s2, s3);
        } else {
            System.out.printf("%s + %s is not equal to %s", s1, s2, s3);
        }
    }
}
