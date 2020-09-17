package kapittel9.Madlibs;

/**
 * Ja det er fredag idag og derfor passer denne veldig bra KAKE
 *
 * 1. Lag en superklasse ved navn Kake,
 * som har 2 variabler: Smak og Pris og en konstruktør som tar i mot samk.
 * Lag getter og setter metoder for variablene
 * 2. Lag BursdagsKake klasse som arver fra Kakeog variabler kalt stearinLys
 * Dennes konstruktør bør sette smak, lag getter og setter metoder.
 * 3. Lag en BryllupsKake som arver fra Kake, har variablen bindinger Dennes konstruktør stter smak,
 * leg getter og setter metoder.
 * 4. Lag en KakeSmaker klasse som tester ut arven ved å skrive ut smak og pris for hver av kakene
 *
 */

import java.util.Scanner;

public class Kake {

    public static String smak;
    public static double pris;

    public Kake() {
        Kake kake = new Kake();
        System.out.println("Tast smaken du vil ha på kaken: ");
        Scanner scanner = new Scanner(System.in);
        String smak = scanner.next();
        setSmak(smak);
        System.out.println("Tast in kostnadene for kaken på kaken: ");
        double kostnad = scanner.nextDouble();
        double totalPris = kostnad + (kostnad * 0.5)+ (kostnad * 0.25);
        setPris(totalPris);
        scanner.close();
    }

  /**  public Kake(double pris){
        Kake kake = new Kake(double pris);
        System.out.println("kostnad for kaken på kaken: ");
        Scanner scanner = new Scanner(System.in);
        double kostnad = scanner.nextDouble();
        double totPris = kostnad + (kostnad * 0.5)+ (kostnad * 0.25);
        scanner.close();
    } */


    public static String getSmak() {
        return smak;
    }



    public static double getPris() {
        return pris;
    }

    public static void setPris(double pris) {
        Kake.pris = pris;
    }

    public static void setSmak(String smak) {
        Kake.smak = smak;
    }

}
