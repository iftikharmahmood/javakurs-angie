package no.nav.iftikhar.kapittel7;

// Import os;

// os.system("cls") # Windows;

// Import the File class
// import java.io.File;

// Import the IOException class to handle errors
// import java.io.IOException;
import java.util.Scanner;


public class Tabeller {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char[][] kolonneRad = new char[10][10];

        char bokstavIndex='A';
        char tallIndex='1';

        kolonneRad[0][0] = '*';
        kolonneRad[1][0] = bokstavIndex;
        kolonneRad[0][1] = tallIndex;

        for (int i = 1; i < 10; i++){
            kolonneRad[i][0] = tallIndex++;
        }

        for (int i = 0; i < 10; i++){
            kolonneRad[0][i] = bokstavIndex++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Rad " + i + " = " + kolonneRad [i][0]);
            System.out.println();
            System.out.println(" kolonne " + i + " = "+ kolonneRad [0][i]);
            System.out.println();
        }

        System.out.println("Trykk en tast og enter for å fortsette");
        String tasteTrykk = scanner.next();

        for (int i = 0; i < 10; i++) {
            System.out.println( " Tabellen blir slik: ");
            System.out.println(  i + " rad gir verdien: " + kolonneRad [i][0] + " og klonneverdi: " + kolonneRad [0][i] );
            System.out.print(kolonneRad [i][0] + " ");
            System.out.print(kolonneRad [0][i]);
            System.out.println();
        }

        System.out.println("Trykk en tast og enter for å fortsette");
        String taste = scanner.next();

        clearScreen();

        skrivUtAlfabetet();

        scanner.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void skrivUtAlfabetet() {
        //Runtime.getRuntime().exec("cls");
        //System.out.flush();
        char alphabet='A';
        for (int i =0; i < 27; i++){
            System.out.print(alphabet + " | ");
            alphabet++;
        }
    }
}
