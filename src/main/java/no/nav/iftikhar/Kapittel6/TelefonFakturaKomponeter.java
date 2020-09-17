package no.nav.iftikhar.Kapittel6;

public class TelefonFakturaKomponeter {

    private static String identifikator;
    //private String identifikator;
    private static String fakturaAdressat;
    private static String fakturaAdresse;
    private static int fakturaNr;
    private static double grunnbelop;
    private static double inkluderteTellerSkritt;
    private static double tellerSkrittForrukt;
    private static double restTellerSkritt;
    private static double mva;

    public TelefonFakturaKomponeter(){
        identifikator = "0047 950 55 971";
        fakturaAdressat = " Iftikhar Mahmood";
        fakturaAdresse = "Brunasvei 91";
        fakturaNr = fakturaNr +1000;
        grunnbelop = 500;
        inkluderteTellerSkritt = 1000;
        tellerSkrittForrukt = 3000;
        restTellerSkritt = tellerSkrittForrukt - inkluderteTellerSkritt;
        mva = 0.15;

    }

    public void setIdentifikator(String identifikator) {
        this.identifikator = identifikator;
    }

    public void setFakturaAdressat(String fakturaAdressat) {
        this.fakturaAdressat = fakturaAdressat;
    }

    public void setFakturaAdresse(String fakturaAdresse) {
        this.fakturaAdresse = fakturaAdresse;
    }

    public void setFakturaNr(int fakturaNr) {
        this.fakturaNr = fakturaNr;
        fakturaNr = fakturaNr + 100;
    }

    public void setGrunnbelop(double grunnbelop) {
        this.grunnbelop = grunnbelop;
    }

    public void setInkluderteTellerSkritt(double inkluderteTellerSkritt) {
        this.inkluderteTellerSkritt = inkluderteTellerSkritt;
    }

    public void setTellerSkrittForrukt(double tellerSkrittForrukt) {
        this.tellerSkrittForrukt = tellerSkrittForrukt;
    }

    public void setRestTellerSkritt(double restTellerSkritt) {
        this.restTellerSkritt = restTellerSkritt;
    }

    public void setMva(double mva) {
        this.mva = mva;
    }

    public static String getIdentifikator() {
        return identifikator;
    }

    public String getFakturaAdressat() {
        return fakturaAdressat;
    }

    public String getFakturaAdresse() {
        return fakturaAdresse;
    }

    public int getFakturaNr() {
        return fakturaNr;
    }

    public double getGrunnbelop() {
        return grunnbelop;
    }

    public double getInkluderteTellerSkritt() {
        return inkluderteTellerSkritt;
    }

    public double getTellerSkrittForrukt() {
        return tellerSkrittForrukt;
    }

    public double getRestTellerSkritt() {
        return restTellerSkritt;
    }

    public double getMva() {
        return mva;
    }



    public double restTelleSkritt() {
        return inkluderteTellerSkritt - tellerSkrittForrukt;
    }

    public double subTotal() {
        return (tellerSkrittForrukt - inkluderteTellerSkritt) + (grunnbelop);
    }

    public double beregnMva(){
        return (tellerSkrittForrukt - inkluderteTellerSkritt + grunnbelop) * mva;
    }

    public double totalsum() {
            return subTotal() + beregnMva();
    }


    public static void main(String args[]){

        System.out.println(" Telefon ID : "+ TelefonFakturaKomponeter.getIdentifikator() );
        System.out.println(" Faktura navn: " + TelefonFakturaKomponeter.fakturaAdresse);
        System.out.println("Faktura adresse: " + TelefonFakturaKomponeter.fakturaAdresse);
        System.out.println("Faktura nr: " + TelefonFakturaKomponeter.fakturaNr);
        System.out.println("Grunnbeløp: " + TelefonFakturaKomponeter.grunnbelop);
        System.out.println("Inkluderte tellerskritt: " + TelefonFakturaKomponeter.inkluderteTellerSkritt);
        System.out.println("Forbrukte tellerskritt: " + TelefonFakturaKomponeter.tellerSkrittForrukt);
        System.out.println("Rest tellerskritt: " + TelefonFakturaKomponeter.restTellerSkritt);
        System.out.println("Mer verdi avgift: " + TelefonFakturaKomponeter.mva);
        System.out.println("Sum faktura: ");



    }
}
