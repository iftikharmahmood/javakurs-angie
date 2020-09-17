package kapittel11.AngieSolution;

public class ShapeTester {

    public static void main(String args[]){

        Shape rektngl = new Rektngl(7, 7);
        rektngl.skriv();
        System.out.println(rektngl.calculateArea());
    }
}
