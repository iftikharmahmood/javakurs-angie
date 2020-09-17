package kapittel9;

public class OverrideTest {

    public static void main(String args[]){
        Rektangel rektangel = new Rektangel();
        rektangel.setAntallSider(4);
        rektangel.setLengde(30);
        rektangel.setBredde(40);
        rektangel.kalkulerOmkrets();
        rektangel.skrivUt();
        rektangel.skrivUt();


        Firkant firkant = new Firkant();
        firkant.skrivUt();
        firkant.skrivUt("FIRKANT");
        firkant.skrivUt(rektangel.antallSider);
        firkant.skrivUt(rektangel.bredde);
        firkant.skrivUt(rektangel.lengde);
        firkant.skrivUt(firkant.lengde);
        firkant.skrivUt(firkant.bredde);
        firkant.skrivUt(firkant.antallSider);
        firkant.skrivUt(firkant.kalkulerOmkrets());
    }

}
