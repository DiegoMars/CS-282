package divisibility;

//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.

//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0

import java.util.Scanner;
public class Divisibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        String dividend = input.nextLine();
        System.out.print("Enter the divisible: ");
        String divisible = input.nextLine();

        if (Integer.parseInt(divisible) == 0){
            System.out.printf("%s is divisible by %s", dividend, divisible);
        } else if (Integer.parseInt(dividend) / Integer.parseInt(divisible) == 1){
            System.out.printf("%s is not divisible by %s", dividend, divisible);
        } else {
            System.out.printf("%s is divisible by %s", dividend, divisible);
        }
    }
}
