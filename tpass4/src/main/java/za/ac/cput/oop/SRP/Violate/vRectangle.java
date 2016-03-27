package za.ac.cput.oop.SRP.Violate;

/**
 * Created by Ethon on 3/27/2016.
 */
public class vRectangle {

    private double width;
    private double height;

    public vRectangle() {
    }

    public vRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}
