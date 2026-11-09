package GradingSystem;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int fees = 100;
        System.out.println("-----------------------------");
        System.out.println("ADJOA GRADING SYSTEM");
        System.out.println("-----------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exams score: ");
        int exams = input.nextInt();
        System.out.print("Enter your assessment score: ");
        int assessment = input.nextInt();


        int Total = exams + assessment;

        if (exams >= 25 || assessment >= 15) {
            System.out.println("CONGRATULATION, YOU ARE QUALIFIED FOR CERTIFICATE AT ADJOA UNIVERSITY OF HEALTH ANS SCIENCES");

            System.out.print("Enter your fees paid: ");
            int userFees = input.nextInt();
            double balanceOwn = fees - userFees;
            if (userFees == fees && Total >= 39)
                System.out.println("CONGRATULATION, YOU ARE CERTIFIED FOR CERTIFICATE AT ADJOA UNIVERSITY OF HEALTH ANS SCIENCES");
            else
                System.out.println("SORRY, YOU ARE NOT CERTIFIED FOR CERTIFICATE AT ADJOA UNIVERSITY OF HEALTH AND SCIENCES BECAUSE YOU OWN: GHS -" + balanceOwn );
        }
        else
            System.out.println("SORRY , YOU HAVE FAILED HENCE YOU'RE REPEATED");




    }








}
