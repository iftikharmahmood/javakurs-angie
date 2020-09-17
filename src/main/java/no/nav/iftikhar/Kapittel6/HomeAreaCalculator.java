package Kapittel6;


import java.util.concurrent.atomic.AtomicBoolean;

/*
*Lag en klasse som instanserer Rectangle klasse for å finne arealet på 2 rom i et hus
 */
public class HomeAreaCalculator {
    public static void main(String args[]){
        /********************
         * REKTANGEL1
         *******************/

        //Opprette en instangs av  Rectangle klassen
        Rectangle rom1 = new Rectangle();
        rom1.setBredde(25);
        rom1.setLengde(50);
        double arealetAvRom1 = rom1.beregnAreal();

        /********************
         * REKTANGEL2
         *******************/

        //Opprette en ny instangs av  Rectangle klassen
        Rectangle rom2 = new Rectangle(32, 75);
        double arealetAvRom2 = rom2.beregnAreal();

        double sumAreal= arealetAvRom1 + arealetAvRom2;
        System.out.println("Arealet av begge rommene til sammen blir: " + sumAreal + " kvadratmeter");

    }
}
