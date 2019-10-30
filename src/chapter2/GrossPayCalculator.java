package chapter2; // if in a package, first line must be the package declaration

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble(); // Double is not appropriate for monetary calculations
        scanner.close(); // remember to close the scanner as to not leak memory!

        double grossPay = hours * rate;

        System.out.println("The employee's gross pay is $" + grossPay);
    }

}
