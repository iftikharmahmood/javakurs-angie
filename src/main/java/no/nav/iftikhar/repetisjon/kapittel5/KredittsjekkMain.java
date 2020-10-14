package no.nav.iftikhar.repetisjon.kapittel5;

public class KredittsjekkMain {

    public static void main(String[] args){

        RaskKredittSjekk kredittSjekk = new RaskKredittSjekk();

        double lonn = kredittSjekk.innhentLonn();
        int kredittSkaar = kredittSjekk.innhentKredittsaar();

        kredittSjekk.getScanner().close();

        boolean erKvalifisert = kredittSjekk.erBrukerKvalifisert(kredittSkaar, lonn);

        System.out.println(kredittSjekk.informerBruker(erKvalifisert));
    }
}