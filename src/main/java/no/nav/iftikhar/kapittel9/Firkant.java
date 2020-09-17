package kapittel9;

public class Firkant extends Rektangel {

    @Override
    public double kalkulerOmkrets(){
        return antallSider * lengde;
    }
    public void skrivUt(String Hva){
        System.out.println("Detter er " + Hva);
    }

    public void skrivUt(double maal){
        System.out.println("Detter er " + maal);
    }


}
