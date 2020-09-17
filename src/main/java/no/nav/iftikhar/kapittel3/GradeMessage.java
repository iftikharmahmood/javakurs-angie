package no.nav.iftikhar.kapittel3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Tast inn dine karakterer");
        Scanner scanner = new Scanner(System.in);
        String karakter = scanner.next();

        String melding;

        switch (karakter){
            case "A":
                melding = "Særdeles Godt, tilsvarer en 6er";
                break;
            case "B":
                melding = "Meget Godt, tilsvarer en 5er";
                break;
            case "C":
                melding = "Godt, tilsvarer en 4er";
                break;
            case "D":
                melding = "Nokså Godt, tilsvarer en 3er";
                break;
            case "F":
                melding = "Lite Godt, tilsvarer karaktenrene 2 - 0. Dette er stryk karakter.";
                break;
            default:
                melding = "Ups, Det oppstod en feil! Karakteren du tastet inn stemmer ikke overens med Norsk karakter standard. Prøv med store bokstaver fra A til D og F, kun en karakter av gangen";
                break;
        }

        System.out.println(melding);

    }
}
