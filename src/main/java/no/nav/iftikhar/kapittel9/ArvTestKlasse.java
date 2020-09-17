package no.nav.iftikhar.kapittel9;

public class ArvTestKlasse {

    public static void main(String agrs[]){

        Mor mamm = new Mor();
        mamm.setNavn("Muttern");
        System.out.println(mamm.getNavn() + " er : " + mamm.getKjonn());

        Person person = new Person();
        person.getAlder();
        person.getKjonn();
        person.getNavn();
        person.setAlder(50);
        person.setKjonn("M");
        person.setNavn("Ole Bukk");

        Ansatt ansatt = new Ansatt();
        ansatt.getAnsattID();
        ansatt.getTittel();
        ansatt.setAnsattID("100");
        ansatt.setTittel("General Manager");
        System.out.println("Navnet er " +person.getNavn());
        System.out.println("Alder  " + person.getAlder());
        System.out.println("kjønn " +person.getKjonn());
        System.out.println("Tittel " + ansatt.getTittel());
        System.out.println("ID " + ansatt.getAnsattID());

        testFirkantOverride();
        testArv();
        testOverload();
    }

    public static  void  testFirkantOverride(){
        Rektangel rektangel = new Rektangel();
        rektangel.setLengde(4);
        System.out.println("lengde er : "+ rektangel.getLengde());
        rektangel.setBredde(8);
        System.out.println("Bredden er  : " + rektangel.getBredde());
        System.out.println(rektangel.kalkulerOmkrets());

        Firkant firkant = new Firkant();
        firkant.setLengde(4);
        firkant.setBredde(8);
        System.out.println(firkant.kalkulerOmkrets());
    }

    public static void testArv(){
        Ansatt ansatt = new Ansatt();
        ansatt.setNavn("Iftikhar Mahmood");
        System.out.println(ansatt.getNavn());
    }
    public static void testOverload(){

        Rektangel rektangel = new Rektangel();
        rektangel.skrivUt();

        Firkant firkant = new Firkant();
        firkant.skrivUt("firekanter");
    }
}