package no.nav.iftikhar.kapittel9;

public class Rektangel {

    protected double lengde;
    protected double bredde;
    protected double antallSider = 4;


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

    public double getAntallSider() {
        return antallSider;
    }

    public void setAntallSider(double antallSider) {
        this.antallSider = antallSider;
    }

    public double kalkulerOmkrets(){
        return (2* lengde)+(2*bredde);
    }

    public void skrivUt(){
        System.out.println("Dette er en rektangel");
    }
}
