package no.nav.iftikhar.kapittel9;

public class Ansatt extends Person {

    private String ansattID;
    private String tittel;

    public Ansatt(){
        super(" Dole Duck");
        System.out.println(" In ansatt default constructor");
    }


    public String getAnsattID() {
        return ansattID;
    }

    public void setAnsattID(String ansattID) {
        this.ansattID = ansattID;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }



}
