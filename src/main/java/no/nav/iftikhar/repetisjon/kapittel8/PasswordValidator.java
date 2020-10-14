/**
 * The password must be at least eight characters long.
 * Contain an uppercase letter, contain a special character.
 * Not contain the username and not be the same as the old password.
 */
package no.nav.iftikhar.repetisjon.kapittel8;

import java.util.Scanner;
import static java.lang.Character.*;

public class PasswordValidator {
    private String username;
    private String oldPassWord;
    private String passWord;
    private boolean svar = false;
    private String gammeltPassord;
    private String nyttPassord;
    private final Scanner scanner;



    public PasswordValidator(){
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void hentInput(){
        informasjon();

        System.out.println(" Tast inn ditt brukernavn");
        setUsername(getScanner().next());

        int lokken = 0;
        while (svar == false) {
            System.out.println(" Tast inn ditt gamle passord : ");
            gammeltPassord = getScanner().next();
            passordValidator(gammeltPassord);
            if (svar) {
                setOldPassWord(gammeltPassord);
                lokken = 1;
            } else {
                informasjon();
            }
        }

        int lokkeTo = 0;
        while (lokkeTo < 1){
            System.out.println(" Tast inn det nye passordet ditt : ");
            nyttPassord = getScanner().next();
            passordValidator(nyttPassord);
            if (svar){
                setPassWord(nyttPassord);
                lokkeTo = 1;
            } else {
                informasjon();
            }
        }
    }

    public boolean passordValidator(String passord) {

        // && !passord.startsWith(" ") && !passord.endsWith(" ") && !passord.isEmpty()

        if (passord.length() >= 8 ){
            boolean harSpesialTegn = false;
            boolean harStorBokstav = false;
            boolean harLitenBokstav = false;
            boolean harMellomrom = false;
            boolean erIkkeLikBrukerNavn = true;
            boolean erIkkeLikGammeltPassord = true;

            for (int i =0; i < passord.length(); i++){

                if (isUpperCase(passord.charAt(i))){
                    harStorBokstav = true;
                    System.out.println("Inneholder stor bosktav");
                }

                if (isLowerCase(passord.charAt(i))){
                    harLitenBokstav = true;
                    System.out.println("Inneholder liten bosktav");
                }

                if (isWhitespace(passord.charAt(i))){
                    harMellomrom = true;
                    System.out.println("Inneholder mellomrom");
                }

                if (('*' | '&' | 'æ' | 'Æ' | 'ø' | 'Ø' | '#' | '@') == (passord.charAt(i))){
                    harSpesialTegn = true;
                    System.out.println("Inneholder spesialtegn");
                }

                if (passord.equals(getUsername())){
                    erIkkeLikBrukerNavn = false;
                }

                if (passord.equals(getOldPassWord())){
                    erIkkeLikGammeltPassord = false;
                }
            }

            if (harSpesialTegn && harStorBokstav && harLitenBokstav && !harMellomrom && erIkkeLikBrukerNavn && erIkkeLikGammeltPassord){
                svar = true;
                System.out.println("Passordet er riktig verifisert");
            }
        }
        return svar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPassWord() {
        return oldPassWord;
    }

    public void setOldPassWord(String oldPassWord) {
        this.oldPassWord = oldPassWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void informasjon(){
        System.out.println();
        System.out.println("************************ REGLER FOR ENDRING AV PASSORD I NAV **************************");
        System.out.println("                                    HUSK AT:");
        System.out.println("Passordet ditt kan ikke være det samme som brukernavnet");
        System.out.println("Passordet ditt kan ikke være det samme som de 2 forrige passordene dine");
        System.out.println("Passordet ditt må være minst 8 ten tilsammen");
        System.out.println("Passordet ditt kan ikke inneholde mellomrom");
        System.out.println("Passordet ditt må innehold store og små bokstaver, og kan inneholde bokstaver og tall");
        System.out.println("Passordet ditt må inne holde et av følgende spesialtegn");
        System.out.println("*, &, æ, Æ, ø, Ø, #, @");
        System.out.println("                            -=- PASSORD ER IKKE BLITT SATT -=-");
        System.out.println("***************************************************************************************");
        System.out.println();
    }
}