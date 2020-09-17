package kapittel4;
import java.util.Scanner;


/*
*NESTED LOOPS:
* Finde the average of each student's test score
 */

public class AverageTestCore {
    public static void main(String args[]){

        //deklarere kjente variabler
        int antllElever = 24;
        int antallEksamensFag = 4;

        Scanner scanner = new Scanner(System.in);

        //Gå igjennom hver eneste elev ( prosseser alle elever )
        for (int i = 0; i < antllElever; i++){

            double sumKarakterer =0;

            //Gå igjennom hvert eneste fag for aktuell elev
            for ( int j=0; j < antallEksamensFag; j++){
                System.out.println("Tast inn testresultatet for fag nr. : " + (j+1));
                double testResultat = scanner.nextDouble();
                sumKarakterer = sumKarakterer + testResultat;

            }
            double snittKarakter = (sumKarakterer / antallEksamensFag);
            System.out.println("Gjennomsnittskarakteren for elev nr. : " + (i+1) + " Etter eksamen i " + antallEksamensFag + " eksamensfag er: " + snittKarakter);
        }
        scanner.close();
    }
}
