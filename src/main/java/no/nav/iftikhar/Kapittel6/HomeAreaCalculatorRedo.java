package no.nav.iftikhar.Kapittel6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in); // måtte flyttes til global og gjøres om til objekt private

    public static void main(String args []){

        HomeAreaCalculatorRedo kalkulator = new HomeAreaCalculatorRedo(); // tom konstruktør for å hente verdier ut av metodene under

        Rectangle kjokken = kalkulator.getRoom();
        Rectangle bad = kalkulator.getRoom();

        double areal = kalkulator.kalkulerTotalAreal(kjokken, bad);

        System.out.println(" Det totale arealet er: " + areal + " kvadratmeter");

        kalkulator.scanner.close(); // funker for å lukke scanner i methode og utenfor,

    }
    public Rectangle getRoom(){

        System.out.println(" Tast inn lengden på rommet: ");
        double lengde = scanner.nextDouble();

        System.out.println(" Tast inn bredden på rommet: ");
        double bredde = scanner.nextDouble();

        return new Rectangle(lengde, bredde); //returnerer objektet Rectangle med angitt lengde og bredde

    }
    public double kalkulerTotalAreal(Rectangle rektangel1, Rectangle rektangel2){
        return rektangel1.beregnAreal() + rektangel2.beregnAreal();
    }

}
