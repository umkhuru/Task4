package za.ac.cput.oop.SRP.Violate;

/**
 * Created by Ethon on 3/27/2016.
 */
public class vSquare extends vRectangle{

    private double length;

    public vSquare() {
    }

    public vSquare(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area(){

        return length * length;
    }
}
