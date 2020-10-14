package no.nav.iftikhar.repetisjon.kapittel6;

public class BasisKostnadTelefon {

    private static double basisKostnad;


    public BasisKostnadTelefon(double basisKostnad) {

        this.basisKostnad = basisKostnad;
    }

    public static double getBasisKostnad() {

        return basisKostnad;
    }

    public void setBasisKostnad(double basisKostnad) {

        this.basisKostnad = basisKostnad;
    }
}
