package kapittel11;

public class Kube extends Former {


    private double lengde;
    private double bredde;
    private double høyde;
    private double dybde;


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

    public double getDybde() {
        return dybde;
    }

    public void setDybde(double dybde) {
        this.dybde = dybde;
    }


    public Kube(double lengde, double bredde, double høyde, double dybde) {
        setLengde(lengde);
        setBredde(bredde);
        setHøyde(høyde);
        setDybde(dybde);
    }

    public Kube(double lengde, double bredde, double høyde){
        setLengde(lengde);
        setBredde(bredde);
        setHøyde(høyde);
    }


    @Override
    public double finnOmkrets() {
        return  (lengde+bredde+høyde+dybde);
    }

    @Override
    public double finnVolum() {
        return ( lengde * bredde) * høyde;
    }


    public void skrivUt() {
        super.skrivUt();
    }
}
