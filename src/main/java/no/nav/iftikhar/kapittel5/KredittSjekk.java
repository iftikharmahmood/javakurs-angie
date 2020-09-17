package kapittel5;
/*
* VARIABLENES SCOPE / VIRKEOMRÅDE
* Lag et program for rask kreditt sjekk, som godkjenner alle som tjener 250000 kroner
* og har kredittverdighet tilsvarende 700 eller flere poeng.
* Alle andre blir avvist.
 */

import java.util.Scanner;

public class KredittSjekk {
    //deklarer kjente globale variabler

  static   int minimummsInntekt = 250000;
  static int minimummsKredittVerdighet = 700;
  static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){


        // innhente ukjente
        double lonn = innhentLonn();
        int kredittVerdighet = innhentKredittV();
        scanner.close();

        // kontrollere om bruker er kvalifisert
       boolean kvalifisering =  erBrukerKvalifisert(kredittVerdighet, lonn);

        // informere bruker
        informerBruker(kvalifisering);

    }
    public static double innhentLonn(){
        System.out.println("Tast inn årslønn: ");
        double lonn = scanner.nextDouble();
        return lonn;
    }

    public static int innhentKredittV(){
        System.out.println(" Tast inn din kredittverdighets poeng: ");
        int kredittVerdighet = scanner.nextInt();
        return kredittVerdighet;
    }

    public static boolean erBrukerKvalifisert(int kredittVerdighet, double lonn){
        if (kredittVerdighet >= minimummsKredittVerdighet && lonn >= minimummsInntekt){
            return true;
        }
        else {
            return false;
        }

    }
    public static void informerBruker( boolean erBrukerKvalifisert){
        if (erBrukerKvalifisert){
            System.out.println(" Gratulerer du er blitt godkjent for lån");
        }
        else {
            System.out.println("Avvist! Beklager du kvalifiserer ikke til låneopptak");
        }
    }
}
