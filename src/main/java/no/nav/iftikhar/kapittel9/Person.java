package kapittel9;

public class Person {

    //Fields
    private String navn;
    private  int alder;
    private String kjonn;

    public Person(){

        System.out.println("In Person default construktor");
    }

    public Person(String navn){

        System.out.println("Person 2nd construktor. Navnet er satt");
    }


    public String getNavn() {

        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {

        return alder;
    }

    public void setAlder(int alder) {

        this.alder = alder;
    }

    public String getKjonn() {

        return kjonn;
    }

    public void setKjonn(String kjonn) {

        this.kjonn = kjonn;
    }



}
