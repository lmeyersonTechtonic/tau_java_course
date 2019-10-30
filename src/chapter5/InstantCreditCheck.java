package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize what we know

        // Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();

        // Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        // notify user
        notifyUser((qualified));

        scanner.close();
    }

    public static double getSalary() {

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore() {

        System.out.println("Enter your credit score.");
        int creditScore = scanner.nextInt();
        return creditScore;

    }

    public static boolean isUserQualified(int creditScore, double salary) {

        return creditScore >= requiredCreditScore && salary >= requiredSalary;

    }

    public static void notifyUser(boolean isQualified) {
        if(isQualified) {
            System.out.println("Congrats! You've been approved");
        } else {
            System.out.println("You've been declined");
        }
    }

}
