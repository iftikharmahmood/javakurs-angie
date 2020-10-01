package no.nav.iftikhar.repetisjon.kapittel6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        HomeAreaCalculatorRedo kalkulator = new HomeAreaCalculatorRedo();

        Rectangle bad = kalkulator.getRoom();
        Rectangle balkong = kalkulator.getRoom();

        double arealet = kalkulator.beregnTotalArealet(bad, balkong);
        System.out.println(" Totale arealet er " + arealet + " kvm");

        double omkretsen = kalkulator.beregnTotalOmkretsen(bad, balkong);
        System.out.println(" Omkretsen er " + omkretsen + " meter");

        kalkulator.scanner.close();
    }

    public Rectangle getRoom() {
        System.out.println(" Tast inn lengden av rommet eller stedet: ");
        double lengde = scanner.nextDouble();

        System.out.println(" Tast inn bredden v rommet eller stedet: ");
        double bredde = scanner.nextDouble();
        return new Rectangle(lengde,bredde);
    }

    public double beregnTotalArealet(Rectangle bad, Rectangle balkong) {
        return bad.calculateArea() + balkong.calculateArea();
    }

    public double beregnTotalOmkretsen(Rectangle bad, Rectangle balkong) {
        return bad.calculatePerimeter() + balkong.calculatePerimeter();
    }
}