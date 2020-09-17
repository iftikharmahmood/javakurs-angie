package kapittel9.Madlibs;

/**
 * Ja det er fredag idag og derfor passer denne veldig bra KAKE
 *
 * 1. Lag en superklasse ved navn Kake,
 * som har 2 variabler: Smak og Pris og en konstruktør som tar i mot samk.
 * Lag getter og setter metoder for variablene
 * 2. Lag BursdagsKake klasse som arver fra Kake og variabel kalt stearinLys
 * Dennes konstruktør bør sette smak, lag getter og setter metoder.
 * 3. Lag en BryllupsKake som arver fra Kake, har variablen nivåer Dennes konstruktør stter smak,
 * leg getter og setter metoder.
 * **********************************************************************************************
 * 4. Lag en KakeSmaker klasse som tester ut arven ved å skrive ut smak og pris for hver av kakene
 ***************************************************************************************************
 */

public class KakeSmaker {

    public static void main (String args[]){

        plainKake();
        bursdagskake();
        bryllupskake();
    }

    public static void plainKake(){
        //Bake plain kake
        Kake.setSmak("Vanilje");
        Kake.setPris(100);

        // Levere ut plain kake
        System.out.println(" ******** STANDARD PLAIN KAKE ******** ");
        System.out.println(" Smaken på plain kake er :" + Kake.getSmak());
        System.out.println(" Prisen på plain kake er :" + Kake.getPris());
        System.out.println(" ************************************* ");
    }

    public static void bursdagskake(){
        //Bake bursdagskake
        BursdagsKake.setSmak("Jordbær");
        BursdagsKake.setPris(150);
        BursdagsKake.setStearinLys(4);

        // Lever ut Bursdagskake
        System.out.println(" *********** BURSDGSKAKE *********** ");
        System.out.println(" Smaken på BURSDGSKAKEN er :" + BursdagsKake.getSmak());
        System.out.println(" Prisen på BURSDGSKAKEn er :" + BursdagsKake.getPris());
        System.out.println(" Antall ys på BURSDGSKAKEN er :" + BursdagsKake.getStearinLys());
        System.out.println(" ************************************* ");
    }

    public static void bryllupskake(){
        // Bake kake
        BryllupsKake.setSmak("Red Velvet Mocca");
        BryllupsKake.setPris(250);
        BryllupsKake.setLag(3);

        // Lever ut Bryllupskake
        System.out.println(" *********** BRYLLUPSKAKE *********** ");
        System.out.println(" Smaken på BRYLLUPSKAKEN er :" + BryllupsKake.getSmak());
        System.out.println(" Prisen på BRYLLUPSKAKEN er :" + BryllupsKake.getPris());
        System.out.println(" Antall lag på BRYLLUPSKAKEN er :" + BryllupsKake.getLag());
        System.out.println(" ************************************* ");


    }
}
