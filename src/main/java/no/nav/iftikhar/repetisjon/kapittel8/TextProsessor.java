package no.nav.iftikhar.repetisjon.kapittel8;

import java.util.Scanner;

public class TextProsessor {

    public static void main(String[] args){
        TextProsessor textProsessor = new TextProsessor();

        textProsessor.tellOrd("Dette er en tekst med noen spesialtegn som feks & - _  æ ø å £ $");

        textProsessor.reverserTekst("Hele teksten blir reversert ");

        textProsessor.addSpace("DetteVarIUtgangspunktetEnTekstUtenMelllomromISegMenViFårSeEtterKjøringaDa.");
    }

    /**
     *
     * @param tekst
     */
    public void tellOrd(String tekst) {
        var ord = tekst.split(" ");
        int antallOrd = ord.length;

        String melding= String.format(" Teksten inneholder %d ord", antallOrd);

        System.out.println(melding);

        for (int i = 0; i < antallOrd; i++){
            System.out.println(ord[i]);
        }
    }

    /**
     *
     * @param bakover
     */
    public void reverserTekst(String bakover) {
        System.out.println(bakover);
        System.out.println();
        for(int i = bakover.length()-1; i >= 0; i--){
            System.out.print(bakover.charAt(i));
        }
        System.out.println();
    }

    /**
     *
     * @param text
     */
    public void addSpace(String text){
        System.out.println();
        System.out.println(text);
        System.out.println();
        var modifiedText = new StringBuilder(text);
        for (int i=0; i < modifiedText.length(); i++){
            if ( i !=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);

    }
}
