package no.nav.iftikhar.kapittel11;

public class Trekant extends Former{


    private double lengde;
    private double bredde;
    private double høyde;

    public double getLengde() {
        return lengde;
    }

    public void setLengde(double lengde) {
        this.lengde = lengde;
    }

    public double getBredde() {
        return bredde;
    }

    public void setBredde(double bredde) {
        this.bredde = bredde;
    }

    public double getHøyde() {
        return høyde;
    }

    public void setHøyde(double høyde) {
        this.høyde = høyde;
    }

    public Trekant(double lengde, double bredde, double høyde){
        setLengde(lengde);
        setBredde(bredde);
        setHøyde(høyde);
    }



    @Override
    double finnOmkrets() {
        return lengde+bredde+høyde;
    }

    @Override
    double finnVolum() {
        double grunnFlate = (lengde * høyde) / 2;
        return grunnFlate * høyde;
    }

    public void skrivUt() {
        super.skrivUt();
    }
}
