package no.nav.iftikhar.kapittel3;
/*
*IF ELSE
* All sales people are expected to make atleast 10 sales each week.
* For those who do, they recive a congratulatory message.
* For those who don`t they are informed of how many sales they were short
 */

import java.util.Scanner;

public class QoutaCalculator {
    public static void main(String[] args) {
        // Initialize known values
        int kvote = 10;
        // Get unknown values
        System.out.println(" Tast inn antall gjennomførte salg.");
        Scanner scanner = new Scanner(System.in);
        int antallSalg = scanner.nextInt();
        scanner.close();

        // Make a decition on the path to take - output
        if (antallSalg>=kvote){
            System.out.println("Gratulerer du har fylt kravet for antall minimums salg denne uken.");

        }
        else {
            int underSalg = kvote - antallSalg;
            System.out.println(" Du klaret ikke å fylle din kvote for minimums salg. Du ligger under med : "+ underSalg +" salg denne uken.");
        }



    }
}
