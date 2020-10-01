package no.nav.iftikhar.repetisjon.kapittel6;

public class Rectangle {
    private double length;
    private double width;

    //eksempel på default construkctor
    public Rectangle(){
        length=0;
        width=0;
    }

    //enda en konstruktør,  Konstruktøren insatnsierer objektet og forventer verdier inn utenfra som parametre
    public Rectangle(double length, double width){
        this.width=width; // under konstruksjon, instansiering av dette objektet kan begge måter brukes til å sette verdier
        setLength(length); // enten direkte med this. eller ved bruk av set metoden
    }


    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double calculatePerimeter(){
        return (2* length)+(2* width);
    }

    public double calculateArea(){
        return length * width;
    }

}
