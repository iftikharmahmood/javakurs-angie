package no.nav.iftikhar.repetisjon.kapittel6;

import java.util.Scanner;

public class MonthCoverter {

    private int etTall;
    private String etOrd;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tast inn et heltall mellom 1 og 12");
        int monthNr = scanner.nextInt();
        System.out.println(" Tast inn navnet på en tilfeldig måned mellom Januar og Desember. NB bruk stor forbokstav");
        String monthNavn = scanner.next();
        System.out.println();
        System.out.println(" Tallet du tastet inn tilsvarer måneden: " + Month.getMonth(monthNr));
        System.out.println(" Måneden du skrev inn tilsvarer måned nr: " + Month.getMonth(monthNavn));

        MonthCoverter maanedkonverter = new MonthCoverter(monthNr, monthNavn);
        System.out.println(" Et ord: " + maanedkonverter.etOrd);
        System.out.println(" Et tall: " + maanedkonverter.etTall);
        System.out.println("********************************************************************************************");
        System.out.println(" disse tallen var matet inn som parametere til objektet maanedkonverter av klassen MonthConverter");
        System.out.println(" Man aksesserer da omjektet Month, tar i bruk dennes metodet getMonth(), og henter ut verdi tilsvarende parametret");
        System.out.println();

        MonthCoverter nyttObjekt = new MonthCoverter(2, "TO");
        System.out.println("********************************************************************************************");
        System.out.println("Dette er et nytt objek med faste verdier. Objektet er av klassen MonthConverter (denne klassen)");
        System.out.println(" Tallet er :" + nyttObjekt.etOrd);
        System.out.println("Ordet er : " + nyttObjekt.etOrd);
        System.out.println(" Tallet igjen " + nyttObjekt.getEtTall());
        System.out.println(" Ordet igjen " +nyttObjekt.getEtOrd());
        System.out.println("********************************************************************************************");


        System.out.println(" Tast inn et heltall");
        int tallet = scanner.nextInt();
        System.out.println("Setter etTall lik tallet ");
        maanedkonverter.setEtTall(tallet);
        System.out.println(" Skriver ut tallet som er satt: " + maanedkonverter.getEtTall());

        System.out.println(" Tast inn et ord");
        String ordet = scanner.next();
        System.out.println(" Setter etOrd lik ordet");
        maanedkonverter.setEtOrd(ordet);
        System.out.println("Skriver ut ordet som ble satt: " + maanedkonverter.getEtOrd());
        System.out.println();

        System.out.println(" Den første delen bruker metoden: getMonth() fra klassen: Month til å hente ut et navn på en måned.");
        System.out.println(" Klassen Month inneholder den statiske metoden getMonth()");
        System.out.println(" siden dette er statiske metode kan den akkseseres direkte UTEN å instansiere klassen Mont.");
        System.out.println(" Vi har her laget en klasse med en get metode med to forskjellige signaturer.");
        System.out.println(" Selve den statiske metoden getMonth(), realiserer også Month kladsse objektet, ");
        System.out.println("som vi henter verdier ut i fra.");
        System.out.println();
        for (int i = 0; i < monthNr; i++) {
            System.out.println(" ER DET RIKTIG FORSTÅTT DERVIS ?");
            System.out.println();
        }
    }

    public MonthCoverter(int etTall, String etOrd) {
        this.etTall = etTall;
        this.etOrd = etOrd;
    }

    public void setEtTall(int etTall){
        this.etTall= etTall;
    }

    public int getEtTall(){
        return etTall;
    }

    public void setEtOrd( String etOrd){
        this.etOrd = etOrd;
    }

    public String getEtOrd(){
        return etOrd;
    }
}
