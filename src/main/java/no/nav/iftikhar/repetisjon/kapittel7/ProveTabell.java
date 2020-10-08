package no.nav.iftikhar.repetisjon.kapittel7;

import java.util.Arrays;

public class ProveTabell {

    public static void main(String[] args){

        String[][] tabell = new String[][]{{"Length", "Width"}, {"Rad", "Kolonne"}, {"C", "3"}, {"D", "4"}, {"Rød", "Grønn"}};
        System.out.println();
        System.out.println(" Tabelldefinisjon = Length, Width | Rad, Kolonne | C, 3 | D, 4 | Rød, Grønn");
        System.out.println();
        System.out.println(" Rad 0, kolonne 0 = " + tabell[0][0]);
        System.out.println(" Rad 0, kolonne 1 = " + tabell[0][1]);
        System.out.println(" Rad 1, kolonne 0 = " + tabell[1][0]);
        System.out.println(" Rad 1, kolonne 1 = " + tabell[1][1]);
        System.out.println(" Rad 2, kolonne 0 = " + tabell[2][0]);
        System.out.println(" Rad 2, kolonne 1 = " + tabell[2][1]);
        System.out.println(" Rad 3, kolonne 0 = " + tabell[3][0]);
        System.out.println(" Rad 3, kolonne 1 = " + tabell[3][1]);
        System.out.println(" Rad 4, kolonne 0 = " + tabell[4][0]);
        System.out.println(" Rad 4, kolonne 1 = " + tabell[4][1]);

        String[][][] tabellTreDim = new String[][][]{{{"Length", "Width", "Depth"},
                {"Rad", "Kolonne", "Ark"}, {"C", "3", "X"}, {"D", "4", "Y"}, {"Rød", "Grønn", "Blå"}}};

        System.out.println();
        System.out.println(" Tabelldefinisjon = Length, Width, Depth | Rad, Kolonne, Ark | C, 3, X | D, 4, Y | Rød, Grønn, Blå");
        System.out.println();
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[0][0][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[0][0][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[0][1][0]);

        /*
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[0][1][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[0][1][1]);

        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[1][0][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[1][0][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[1][1][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[1][1][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][0][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][0][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][1][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][1][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][0][2]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][2][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[2][2][2]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[3][0][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[3][0][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[3][1][0]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[3][1][1]);
        System.out.println(" Rad 0, kolonne 0 = " + tabellTreDim[3][2][0]);

*/

    }
}
