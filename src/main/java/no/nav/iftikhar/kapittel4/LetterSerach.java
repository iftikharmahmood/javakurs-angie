package kapittel4;

import java.util.Scanner;
/*
*LOPP BREAK
* Search a string to dertermine if letter A appears in the string
 */
public class LetterSerach {

    public static void main(String args[]){

        //Lese inn setning
        System.out.println(" Tast inn en setning eller en streng med tilfeldige bokstaver");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.next();
        scanner.close();
        boolean bokstavFunnet = false;


        // Søk etter bokstaven A
        for (int i=0; i <tekst.length(); i++){
            char gjeldendeBokstav =tekst.charAt(i);
            if (gjeldendeBokstav == 'A' || gjeldendeBokstav == 'a') {
                System.out.println(" Posisjon: " + (i+1));
                bokstavFunnet = true;
                break;

            }

        }
        if (bokstavFunnet){
            System.out.println(" Denne teksten inneholder bokstaven A i stor eller liten format.");


        }
        else {
            System.out.println(" Denne teksten inneholder IKKE bokstaven A i stor eller liten format.");
        }
    }
}
