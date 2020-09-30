package no.nav.iftikhar.repetisjon.kapittel5;

import java.util.Scanner;

public class RaskKredittSjekk {

    static int lavesteInntekt = 250000;
    static int lavesteKredittSkaar = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double lonn = innhentLonn();
        int kredittSkaar = innhentKredittsaar();
        scanner.close();

        boolean erKvalifisert = erBrukerKvalifisert(kredittSkaar, lonn);

        informerBruker(erKvalifisert);
    }

    public static double innhentLonn(){
        System.out.println(" Tast inn din årslønn");
        double lonn= scanner.nextDouble();
        return lonn;
    }

    public static int innhentKredittsaar(){
        System.out.println(" Tast inn din kredittskår");
        int kredittSkaar= scanner.nextInt();
        return kredittSkaar;
    }

    private static boolean erBrukerKvalifisert(int kredittSkaar, double lonn) {
        if (kredittSkaar >= lavesteKredittSkaar && lonn >= lavesteInntekt){
            return true;
        }
        else {
            return false;
        }
    }

    private static void informerBruker(boolean erKvalifisert) {
        if (erKvalifisert){
            System.out.println("Gratulerer du er blitt godkjent for lån");
        }
        else {
            System.out.println("Avvist. Du er ikke godkjent for låneoptak");
        }
    }
}