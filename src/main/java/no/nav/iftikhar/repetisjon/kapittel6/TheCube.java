package no.nav.iftikhar.repetisjon.kapittel6;

public class TheCube {

    private double lengde;
    private double bredde;
    private double hoyde;


  /*  public TheCube(double lengde, double bredde, double hoyde){
        this.lengde =lengde;
        this.bredde = bredde;
        this.hoyde = hoyde;
    } */

// Default konstruktør uten parameter inn
    public TheCube() {
        this.bredde=0;
        this.lengde=0;
        this.hoyde=0;
    }

    public TheCube(double lengde, double bredde, double hoyde){
        setLengde(lengde);
        setBredde(bredde);
        setHoyde(hoyde);
    }


    public double getLengde() {
        return lengde;
    }

    public double getBredde() {
        return bredde;
    }

    public double getHoyde() {
        return hoyde;
    }

    public void setLengde(double lengde) {
        this.lengde = lengde;
    }

    public void setBredde(double bredde) {
        this.bredde = bredde;
    }

    public void setHoyde(double hoyde) {
        this.hoyde = hoyde;
    }

    public double omkrets(double lengde, double bredde){
        double omkretsen = ( 2 * lengde ) + ( 2 * bredde );
        return omkretsen;
    }

    public double areal(double lengde, double bredde){
        double arealet = lengde * bredde;
        return arealet;
    }

    public double volum(double lengde, double bredde, double hoyde) {
        double volumet = lengde * bredde * hoyde;
        return volumet;
    }
}
