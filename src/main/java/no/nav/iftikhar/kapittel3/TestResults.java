package no.nav.iftikhar.kapittel3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]){
        //Get test score
        System.out.println("Tass inn din e karakterer");
        Scanner scanner = new Scanner(System.in);
        double poeng = scanner.nextDouble();
        scanner.close();


        //determine the letter grade
        char karakter;

        if (poeng < 60){
            karakter ='F';
        }
        else if (poeng < 70){
            karakter = 'D';
        }
        else if (poeng < 80){
            karakter = 'C';
        }
        else if (poeng < 90){
            karakter = 'B';
        }
        else {
            karakter = 'A';
        }
        System.out.println("Din karakter er :" +karakter + " etter eksamen");
    }
}
