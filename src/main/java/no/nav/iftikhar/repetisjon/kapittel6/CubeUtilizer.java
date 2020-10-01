package no.nav.iftikhar.repetisjon.kapittel6;

public class CubeUtilizer {

    public static void main(String[] args){


        // første kube
        TheCube kuben = new TheCube();
        double volum = kuben.volum(10,10,10);
        System.out.println("Volumet av den aller første kuben er: " + volum + " kubikkmeter");

        //andre kube
        TheCube kubto = new TheCube();
        double volume2 = kuben.volum(20,20,20);
        System.out.println("Volumet av denne Kube A er: " + volume2 + " kubikkmeter");
        System.out.println("Volumet av denne Kube B er: " + kuben.volum(30,30,30) + " kubikkmeter");

        //tredje kube
        TheCube kubtre = new TheCube();
        kubtre.setLengde(4);
        kubtre.setBredde(4);
        kubtre.setHoyde(4);
        System.out.println("Volumet objektinstansen kubtre = " + kuben.volum(kubtre.getLengde(), kubtre.getBredde(), kubtre.getHoyde()) + " kubikkmeter");
        System.out.println(" Omkretsen objektinstansen kubtre = " + kubtre.omkrets(kubtre.getLengde(), kubtre.getBredde()) + " meter");
        System.out.println("Arealet objektinstansen kubtre = " + kubtre.areal(kubtre.getLengde(), kubtre.getBredde()) + " kvadratmeter");


        //fjerde kube

        TheCube kubfire = new TheCube(3, 3, 3);
        double areal = kubfire.areal(kuben.getLengde(), kubtre.getBredde());
        System.out.println(areal);


    }


}
