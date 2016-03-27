package za.ac.cput.oop.SRP.Obey;

/**
 * Created by Ethon on 3/27/2016.
 */
public class Square implements Area{

    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area(){

        return length * length;
    }
}
