package no.nav.iftikhar.kapittel9.Madlibs;

/**
 * Ja det er fredag idag og derfor passer denne veldig bra KAKE
 *
 * 1. Lag en superklasse ved navn Kake,
 * som har 2 variabler: Smak og Pris og en konstruktør som tar i mot samk.
 * Lag getter og setter metoder for variablene
 * **************************************************************
 * 2. Lag BursdagsKake klasse som arver fra Kake og variabel kalt stearinLys
 * Dennes konstruktør bør sette smak, lag getter og setter metoder.
 * ***************************************************************
 * 3. Lag en BryllupsKake som arver fra Kake, har variablen bindinger Dennes konstruktør stter smak,
 * leg getter og setter metoder.
 * 4. Lag en KakeSmaker klasse som tester ut arven ved å skrive ut smak og pris for hver av kakene
 *
 */

public class BursdagsKake extends Kake{

    public static int stearinLys;

    public BursdagsKake() {
        Kake.getSmak();
        Kake.getPris();
        BursdagsKake.setStearinLys(4);
        BursdagsKake.getStearinLys();
    }


    public static int getStearinLys() {
        return stearinLys;
    }

    public static void setStearinLys(int stearinLys) {
        BursdagsKake.stearinLys = stearinLys;
    }

}
