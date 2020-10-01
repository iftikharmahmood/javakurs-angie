package no.nav.iftikhar.repetisjon.kapittel6;

import no.nav.iftikhar.repetisjon.kapittel6.Car;

public class DriveCar {

    public static void main(String[] args) {

        String engineStatus;
        String lys;
        String tak;
        int fart;
        String gir;
        String bilStatus;

        Car bil1 = new Car(true, true, false, 180, "Automatic Super", "On the higway");
        if (bil1.isStart()) {
            engineStatus = "Motoren er i gang";
        } else {
            engineStatus = "Motoren er av";
        }

        if (bil1.isLight()) {
            lys = " Hovedlys på";
        } else {
            lys = " Hovedlys av";
        }

        if (bil1.isRoof()) {
            tak = " Cabriolet taket er av og sikkret i pakket tilstand";
        } else {
            tak = "Cabriolet taket er automatisk sikkret på";
        }
        fart = bil1.getSpeed();
        gir = bil1.getGearStatus();
        bilStatus = bil1.getVenchileStatus();
        System.out.println("*********************** DETTE ER STATUS PÅ KJØRETØY BIL 1 **********************************");
        System.out.println("");
        System.out.println(" Motorstatus på BIL 1 er: " + engineStatus);
        System.out.println(" Status lys på BIL 1 er: " + lys);
        System.out.println(" Taket på BIL 1 er: " + tak);
        System.out.println(" BIL 1 er nå i: " + gir + " posisjon");
        System.out.println(" Farten på BIL 1 er for øyeblikket : " + fart + " kilometer i timen");
        System.out.println(" Hvor befinner BIL 1 seg akkurat nå? : " + bilStatus);


        Car minBil = new Car(false, true, false, 0, "Park", " In garage");
        if (minBil.isStart()) {
            engineStatus = "Motoren er i gang";
        }
        else {
            engineStatus = "Motoren er av";
        }

        if (minBil.isLight()) {
            lys = " Hovedlys på";
        }
        else {
            lys = " Hovedlys av";
        }

        if (minBil.isRoof()) {
            tak = " Cabriolet taket er av og sikkret i pakket tilstand";
        }
        else {
            tak = "Cabriolet taket er automatisk sikkret på";
        }

        fart = minBil.getSpeed();
        gir = minBil.getGearStatus();
        bilStatus = minBil.getVenchileStatus();
        System.out.println("*********************** DETTE ER STATUS PÅ KJØRETØY MIN BIL **********************************");
        System.out.println("");
        System.out.println(" Motorstatus på MIN BIL er: " + engineStatus);
        System.out.println(" Status lys på MIN BIL er: " + lys);
        System.out.println(" Taket på MIN BIL er: " + tak);
        System.out.println(" MIN BIL er nå i: " + gir + " posisjon");
        System.out.println(" Farten på MIN BIL er for øyeblikket : " + fart + " kilometer i timen");
        System.out.println(" Hvor befinner MIN BIL seg akkurat nå? : " + bilStatus);
    }
}
