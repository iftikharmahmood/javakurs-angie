package no.nav.iftikhar.Kapittel6;

public class Rectangle {

    private double lengde;
    private double bredde;

    public Rectangle(){
        lengde = 0;
        bredde = 0;
    }
    public Rectangle(double lengde, double bredde){
        this.lengde = lengde;
        setBredde(bredde);
    }

    public double getLengde(){
        return lengde;
    }
    public void setLengde(double lengde){
        this.lengde = lengde;
    }

    public double getBredde(){
        return bredde;
    }

    public void setBredde(double bredde){
        this.bredde = bredde;
    }

    public double beregnOmkrets(){
        return (2 * lengde) + (2 * bredde);
    }

    public double beregnAreal(){
        return lengde * bredde;
    }

}
