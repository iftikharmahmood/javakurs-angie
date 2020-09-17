package no.nav.iftikhar.kapittel11b;

import java.util.Scanner;

/**
 * 1. Your optional exercise for this chapter is to create an abstract class called Animal,
 * which declares an abstract method called makeSound(), and implements a non-abstract method called eat().
 *
 * Then create a Pig class and a Duck class that both extend the Animal class.
 *
 * Finally, create a Farm class to test these implementations.
 */
public abstract class Animal {

    public abstract void makeSound();

      public void eat(){
         Scanner scanner = new Scanner(System.in);
         String dyreFor;
         System.out.println("tast inn type dyrefor du vil mate dyret med:  ");
         dyreFor = scanner.next();
         System.out.println(" Dyret ditt spiser nå: " + dyreFor);
    }


}
