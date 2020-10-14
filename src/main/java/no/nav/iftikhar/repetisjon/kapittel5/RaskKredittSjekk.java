package no.nav.iftikhar.repetisjon.kapittel5;

import java.io.InputStream;
import java.util.Scanner;

public class RaskKredittSjekk {

    private final int LAVESTE_INNTEKT = 250000;
    private final int LAVESTE_KREDITT_SKAAR = 700;
    private Scanner scanner;


    public RaskKredittSjekk(){
         this.scanner = new Scanner(System.in);
    }

    public RaskKredittSjekk(Scanner scanner){
        this.scanner = scanner;
    }

    public RaskKredittSjekk(InputStream in){
        this.scanner = new Scanner(in);
    }

    public Scanner getScanner(){
        return scanner;
    }

    public double innhentLonn(){
        System.out.println(" Tast inn din årslønn");
        double lonn = getScanner().nextDouble();
        return lonn;
    }

    public int innhentKredittsaar(){
        System.out.println(" Tast inn din kredittskår");
        int kredittSkaar= getScanner().nextInt();
        return kredittSkaar;
    }

    public boolean erBrukerKvalifisert(int kredittSkaar, double lonn) {
        if (kredittSkaar >= LAVESTE_KREDITT_SKAAR && lonn >= LAVESTE_INNTEKT){
            return true;
        }
        else {
            return false;
        }
    }

    public String informerBruker(boolean erKvalifisert) {
        if (erKvalifisert){
            return "Gratulerer du er blitt godkjent for lån";
        }
        else {
            return "Avvist. Du er ikke godkjent for låneoptak";
        }
    }
}