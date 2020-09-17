package kapittel11;

public class FormTester {
    public FormTester() {

    }

    public static void main(String args[]) {


        // Teste ut trekan og prisme i Trekant klassen
        Former trekant = new Trekant(10,20,15);
        System.out.println();
        System.out.println(" Omkretsen til en trekant er :  " + trekant.finnOmkrets());
        System.out.println();
        trekant.skrivUt();
        System.out.println();

        Former prisme = new Trekant(1,10,10);
        System.out.println();
        System.out.println( " Volumet til en likesidet trekantet prisme er :  " + prisme.finnVolum());
        System.out.println();
        prisme.skrivUt();
        System.out.println();


// Teste firkant og kube
        Former firkant = new Kube(5,10, 15, 20);
        System.out.println();
        System.out.println("Grunnfalten av firkanten er : " + firkant.finnOmkrets());
        System.out.println();
        firkant.finnOmkrets();
        System.out.println();

        Former kube = new Kube(5, 8, 9);
        System.out.println();
        System.out.println("Volumet av kuben er : " + kube.finnVolum());
        System.out.println();
        kube.skrivUt();

    }
}
