package kapittel5;
/*
* Første METODE
* Lag en metode som ber bruker taste3 inn navnet, og deretter hilser bruker adressert med navne.
 */

import java.util.Scanner;

public class Hilsen {

    public static void main(String args []){
        System.out.println(" Tast inn navnet ditt");
        Scanner scanner = new Scanner(System.in);
        String navn= scanner.next();
        hilseBruker(navn);
    }
    public static void hilseBruker(String navn){
        System.out.println("Hei " + navn);
    }
}
