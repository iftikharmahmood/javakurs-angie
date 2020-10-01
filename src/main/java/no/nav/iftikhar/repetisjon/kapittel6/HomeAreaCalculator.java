package no.nav.iftikhar.repetisjon.kapittel6;

import no.nav.iftikhar.repetisjon.kapittel6.Rectangle;

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
        double totalAreal = arealGang + arealetAvSoverom + arealKjokken + arealStue;

        System.out.println(" ************************************ Huset er bygget opp slik *****************************");
        System.out.println(" Soverom : ");
        System.out.println("            Areal: " + arealKjokken + " kvm");
        System.out.println("          Omkrets: " + kjokken.calculatePerimeter() + " meter");
        System.out.println("");
        System.out.println(" Kjøkken : ");
        System.out.println("            Areal: " + arealetAvSoverom + " kvm");
        System.out.println("          Omkrets: " + soverom.calculatePerimeter() + " meter");
        System.out.println("");
        System.out.println(" Stue : ");
        System.out.println("            Areal: " + arealStue + " kvm");
        System.out.println("          Omkrets: " + stue.calculatePerimeter() + " meter");
        System.out.println("");
        System.out.println("            Areal: " + arealGang + " kvm");
        System.out.println("          Omkrets: " + gang.calculatePerimeter() + " meter");
        System.out.println(" *******************************************************************************************");
        System.out.println("");
        System.out.println("    Husets totale areal er: " + (totalAreal) + " kvm");
        System.out.println("    Husets totale omkrets er: "+ totalOmkrets + " meter");
        System.out.println(" *******************************************************************************************");
        System.out.println(" *******************************************************************************************");
    }

}
