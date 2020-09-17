package no.nav.iftikhar.kapittel8;
/*
*Lage et program som ivaretar koplese sikkerheten i passordet ved at
* den påser at passordets regler følges
* Passordet må være minst 8 karakterer langt, inneholde minst en stor bokstav
* inneholde minst et spesialtegn, kan ikke være lik brukernavnet
* kan ikke være lik det gamle passordet
 */

import java.util.Scanner;

public class PasswordValidator {

    public static String[][] securityAccessManagerDataBase;
    public static String[] userName;
    public static String password;
    public static String oldPassword;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        userDataInn();

    }

    // innhent data
    private static String[] userDataInn() {
        userName = new String[4];
        for (int i = 0; i < 5; i++){
            System.out.println(" Tast inn " + i + " Brukernavn");
             String name = scanner.next();


        }
        return userName;
    }

    // build hash# table
    public static String samdb(){



        return null;
    }


}
