package no.nav.iftikhar.Kapittel6Reloaded;
/*
*Program for detaljert telefon regning i objekt-orientert stil
*
* oppgave kriterier
* 1. Telefonregningen skal ha:
*       ID
*       faste kostnader
*       tellerskritt inkludert i faste kostnader
*       brukte tellerskritt
*       antall gjenstående tellerskritt
*       Beregnet merverdi avgift
* 2. Detaljert faktura skal skrives ut som resultat
* 3. Følgende konstruktører skal inkluderes:
*       default
*       id-only
*       all fields / samtlige globale variabler
* 4. Lag en klasse som instansierer objektet telefonfaktura og som skriver ut en detaljert faktura
*
 */

public class TelefonFaktura3 {


    //Fields
    private int id;
    private double fasteKostnader;
    private double tellerskrittInkludert;
    private double brukteTellerskritt;
    private double mva;


    //instansiering av objektet TelefonFaktura3

    public TelefonFaktura3(){
        id = 0;
        fasteKostnader = 790.99;
        tellerskrittInkludert = 800;
        brukteTellerskritt = 800;
        mva = 0.15;
    }

    // instansiering av objektet med kun ID
    public TelefonFaktura3(int id){
        this.id = id;
        fasteKostnader = 790.99;
        tellerskrittInkludert = 800;
        brukteTellerskritt = 800;
        mva = 0.15;
    }


    // instansiering av objektet med samtlige Fields
    public TelefonFaktura3(int id, double fasteKostnader, double tellerskrittInkludert, double brukteTellerskritt, double mva){
        this.id = id;
        this.fasteKostnader = fasteKostnader;
        this.tellerskrittInkludert =tellerskrittInkludert;
        this.brukteTellerskritt = brukteTellerskritt;
        this.mva = mva;
    }


    // ***** getters and setters *****

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFasteKostnader() {
        return fasteKostnader;
    }

    public void setFasteKostnader(double fasteKostnader) {
        this.fasteKostnader = fasteKostnader;
    }

    public double getTellerskrittInkludert() {
        return tellerskrittInkludert;
    }

    public void setTellerskrittInkludert(double tellerskrittInkludert) {
        this.tellerskrittInkludert = tellerskrittInkludert;
    }

    public double getBrukteTellerskritt() {
        return brukteTellerskritt;
    }

    public void setBrukteTellerskritt(double brukteTellerskritt) {
        this.brukteTellerskritt = brukteTellerskritt;
    }

    public double getMva() {
        return mva /100;
    }

    public void setMva(double mva) {
        this.mva = mva;
    }

    //Beregne gjenstående telleskritt og overforbruk

    private double forbruk(){
        double gjenstaaende = tellerskrittInkludert - brukteTellerskritt;
        return gjenstaaende;
    }

    //beregn overforbruk
    private double overForbruk(){
        double overforbruk = tellerskrittInkludert -brukteTellerskritt;
        if (overforbruk > tellerskrittInkludert){
            return overforbruk - tellerskrittInkludert;
        }
        else {
            return 0;
        }
    }

    // beregne saldo

    private double subTotal(){
        double saldo = fasteKostnader + overForbruk();
        return saldo;
    }
    // beregn merverdiavgift

    private double skatt(){
        double moms = subTotal() * getMva();
        return moms;
    }

    private double total (){
        double totalSum = subTotal() + skatt();
        return totalSum;
    }

    public void skrivUtFaktura(){
        System.out.println("************************************************************************************");
        System.out.println();
        System.out.println("                                      Faktura ID: " + getId());
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println();
        System.out.println("                  Faktura for Mobiltelefon number: " + getId());
        System.out.println();
        System.out.println("                                  Faste kostnader: " + getFasteKostnader());
        System.out.println();
        System.out.println("                         Inkluderte ringeminutter: " + getTellerskrittInkludert());
        System.out.println();
        System.out.println("                             Brukte ringeminutter: " + getBrukteTellerskritt());
        System.out.println();
        System.out.println("           Gjenstående av inkludrte ringeminutter: " + overForbruk());
        System.out.println();
        System.out.println("                                         Subtotal: " + subTotal());
        System.out.println();
        System.out.println("                                   Merverdiavgift: " + skatt());
        System.out.println();
        System.out.println("                                        Total sum: " + total());
        System.out.println("************************************************************************************");
        System.out.println("************************************************************************************");

    }
}
