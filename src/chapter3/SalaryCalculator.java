package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    If Statements
    All sales people get a payment of $1000 /week.
    Salespeople who exceed 10 sales get an additional $250.
     */

    public static void main(String[] args) {
        // initial known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // get values for unknowns
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // quick detour for the bonus earners
        if(sales > quota) {
            salary += bonus;
        }

        // output

        System.out.println("The employee's pay is $" + salary);
    }
}
