package no.nav.iftikhar.repetisjon.kapittel5;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args){

        System.out.println(" Tast inn ditt navn");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();

        Greeting greeting = new Greeting();
        greeting.velkommenBruker(name);
    }

    public void velkommenBruker(String name){
        System.out.println(" Hei " + name + " Velkommen til systemet");
    }
}
