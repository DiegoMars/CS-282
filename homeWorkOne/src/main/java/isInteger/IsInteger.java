package isInteger;

import java.util.Scanner;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a string: ");
        input = sc.nextLine();
        boolean number = true;
        for (int i = 0; i <= input.length() - 1; i++){
           char idk = input.charAt(i);
           if (!number) {
               break;
            }
           if (!Character.isDigit(idk) && idk != '-') {
               number = false;
           }
        }
        if (number) {
            System.out.println("The number is integer");
        } else {
            System.out.println("The number is not integer");
        }
    }
}
