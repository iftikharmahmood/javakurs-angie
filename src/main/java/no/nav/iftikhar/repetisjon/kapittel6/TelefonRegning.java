/**
 * bill should have an ID, a base class, a number of allotted minutes and a number of minutes used.
 * And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.
 * And then, it should also be able to print an itemized bill.
 * You should also include three constructors
 * a default one,  one that accepts the ID only, one that accepts all fields
 * Now no matter which of these constructors you use, all fields should be set eventually.
 *
 * Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */


package no.nav.iftikhar.repetisjon.kapittel6;

public class TelefonRegning {


    private static String navn;
    private static int id;
    private static int tlfNr;
    private static double skatteSats;
    private static double brukteTellerskritt;
    private static double gratisTellerskritt;

    //Constructors
    public TelefonRegning() {
        this.navn = "DUMMY CASE id 0000";
        this.id = 0000;
        this.tlfNr = 00000000;
        this.skatteSats = 0.00;
        this.brukteTellerskritt = 0.0;
        this.gratisTellerskritt =0.0;

    }

    // Enda en dummy case med ukjent ID
    public TelefonRegning(int id) {
        this.navn = "DUMMY CASE id ukjent";
        this.id = id;
        this.tlfNr = 12345678;
        this.skatteSats = 25;
        this.brukteTellerskritt = 300.78;
        this.gratisTellerskritt = 200.05;
    }

    // Konstruktør der alle parametere er ment satt av bruker
    public TelefonRegning(String navn, int id, int tlfNr, double skatteSats, double brukteTellerskritt, double gratisTellerskritt) {
        this.navn = navn;
        this.id = id;
        this.tlfNr = tlfNr;
        this.skatteSats = skatteSats;
        this.brukteTellerskritt = brukteTellerskritt;
        this.gratisTellerskritt = gratisTellerskritt;
    }

    //navn
    public static String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    //ID
    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //tlfNr
    public static int getTlfNr() {
        return tlfNr;
    }

    public void setTlfNr(int tlfNr) {
        this.tlfNr = tlfNr;
    }

    //skatteSats
    public static double getSkatteSats() {
        return skatteSats;
    }

    public void setSkatteSats(double skatteSats) {
        this.skatteSats = skatteSats;
    }

    //brukteTellerskritt
    public static double getBrukteTellerskritt() {
        return brukteTellerskritt;
    }

    public void setBrukteTellerskritt(double brukteTellerskritt) {
        this.brukteTellerskritt = brukteTellerskritt;
    }

    //gratisTellerskritt
    public static double getGratisTellerskritt() {

        return gratisTellerskritt;
    }

    public void setGratisTellerskritt(double gratisTellerskritt) {

        this.gratisTellerskritt = gratisTellerskritt;
    }
}
