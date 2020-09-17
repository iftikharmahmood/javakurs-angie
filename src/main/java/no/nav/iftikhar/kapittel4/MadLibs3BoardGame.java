package kapittel4;

/*
*Brettspill
* Brettet har 20 steg (plasser) og målet er å komme seg fra start til mål inne 5 terningkast.
* hvert terningkast kan gi fra 1 -6 tall. Tallet blir tilfeldig generet automatisk
* Spiller flytter fram antall plasser ekvivalent med resultatet av terningkastet.
*/

import java.util.Random;
public class MadLibs3BoardGame {

    public static void main(String args []){

        //Info til bruker
        System.out.println(" Dette er et brettspill");
        System.out.println(" Målet er å klare å komme i mål på maks 5 kast totalt.");
        System.out.println(" Hvert terningkast kan gi fra 1 -6 tall. Tallet blir tilfeldig generet automatisk");
        System.out.println(" Din brikke flyttes like mange plasser som resultatet av terningkastet.");
        System.out.println(" Kommer du i mål innen 5 kast har du vunnet, i motsatt fall har datamaskinen vunnet.");
        System.out.println();

        //Variabel delarasjon
        int posisjonPlasser = 20;
        int brikkePosisjon = 0;
        int teller = 0;

        for (int i=0; i < 5; i++) {
            Random random = new Random();
            int terningKast = random.nextInt(6) + 1;
            brikkePosisjon = brikkePosisjon + terningKast;
            teller = i;

            if (brikkePosisjon < posisjonPlasser) {
                System.out.println("Du kastet tallet: " + terningKast + " på kast nr.: " + (i + 1));
                System.out.println();
                System.out.println("Din brikke er flyttet til plass nr :" + brikkePosisjon + " på spillbrettet" + " Du har :" + (brikkePosisjon - posisjonPlasser) + " Plasser igjen å flytte etter kast nr: " + (i + 1));
                System.out.println();
            }
        }

        if (brikkePosisjon >= posisjonPlasser){
            System.out.println("**********************************************************************************************************************************************");
            System.out.println("**************************************     Gratulerer du har VUNNET Spillet med kun: " + (teller+1) + " kast     *********************************************");
            System.out.println("**********************************************************************************************************************************************");
        }

        else {
            System.out.println();
            System.out.println("*");
            System.out.println(" Du har tapt spillet. Du befinnner deg på plass: " + brikkePosisjon + " Og du har gått tom for terningkast. ");
            System.out.println(" Det står igjen: " +( brikkePosisjon - posisjonPlasser)+ " plasser til du er i mål");
            System.out.println("*");
        }

    }
}