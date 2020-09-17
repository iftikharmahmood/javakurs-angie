package no.nav.iftikhar.kapittel3;
/*
*LOGICAL OPERATORS:
* To qualify for a loan, a person must make at least 300000,00 kr
* og ha jobbet på samme sted i minst 2 år
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]) {

        //initialize known
        int requiredSalary = 300000;
        int reguiredYearsEmployed = 2;

        // get unknown
        System.out.println("Tast inn din årslønn.");
        Scanner scanner = new Scanner(System.in);
        double anualSalary = scanner.nextDouble();
        System.out.println("tast inn antall år du har vært ansatt i stillingen du innehar nå");
        double yearsEmployed = scanner.nextDouble();
        scanner.close();

        // make decision
        if (anualSalary >= requiredSalary && yearsEmployed >= reguiredYearsEmployed) {
            System.out.println("Gratulerer du er kvalisert til å ta opp lån.");
        } else {
            System.out.println("Beklager, du må ha minst kr. " + requiredSalary + " i lønn og vært ansatt på siste arbeidsplass i minst " + reguiredYearsEmployed + " for å kunne ta opp lån");
        }
    }
}

