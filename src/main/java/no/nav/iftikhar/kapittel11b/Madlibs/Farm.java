package no.nav.iftikhar.kapittel11b.Madlibs;

/**
 * 1. Your optional exercise for this chapter is to create an abstract class called Animal,
 * which declares an abstract method called makeSound(), and implements a non-abstract method called eat().
 *
 * Then create a Pig class and a Duck class that both extend the Animal class.
 *
 * Finally, create a Farm class to test these implementations.
 */

public class Farm {

    public static void main(String args[]) {

        // teste ut Kamel
        new Camel().makeSound();

        System.out.println(" Mate kamelen ");
        new Camel().eat();



        //teste ut Duck
        new Duck().makeSound();
    }



}
