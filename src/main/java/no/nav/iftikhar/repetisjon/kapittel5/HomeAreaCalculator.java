package no.nav.iftikhar.repetisjon.kapittel5;

public class HomeAreaCalculator {

    public static void main(String[] args){
        /******
         * Rectangle 1
         *******/

        //lag en instanse av Rectangle klassen
        Rectangle soverom = new Rectangle();//tatt i bruk default konstruktøren
        soverom.setLength(3);
        soverom.setWidth(4);
        double arealetAvSoverom= soverom.calculateArea();
        double omkretsenAvSoverom= soverom.calculatePerimeter();

        /******
         * Rectangle 2
         *******/

        //lag en ny instanse av Rectangle klassen
        Rectangle kjokken = new Rectangle(7,2);
        double arealKjokken = kjokken.calculateArea();
        double omkretsKjokken = kjokken.calculatePerimeter();

        /******
         * Rectangle 3
         *******/

        //lag en ny instanse av Rectangle klassen
        Rectangle stue = new Rectangle(4,4);
        double arealStue = stue.calculateArea();
        double omkretsStue = stue.calculatePerimeter();

        Rectangle gang = new Rectangle();
        gang.setWidth(2);
        gang.setLength(10);
        double arealGang = gang.calculateArea();
        double omkretsGang = gang.calculatePerimeter();

        double totalOmkrets = omkretsKjokken + omkretsenAvSoverom + omkretsGang;
        double totalAreal = arealGang + arealetAvSoverom + arealKjokken +arealStue;

        System.out.println("Husets areal er: " + (arealetAvSoverom+arealKjokken) + " kvm");
        System.out.println("Husets totale omkrets er: "+ totalOmkrets + " meter");
    }
}
