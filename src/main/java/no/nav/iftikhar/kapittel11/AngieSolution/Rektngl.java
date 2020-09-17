package kapittel11.AngieSolution;

public class Rektngl extends Shape {
    private  double length;
    private double width;




    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public Rektngl(double length, double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
