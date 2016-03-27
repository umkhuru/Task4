package za.ac.cput.oop.SRP.Obey;

/**
 * Created by Ethon on 3/27/2016.
 */
public class Rectangle implements Area{

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
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

    //   @Override
    public double area(){
        return width * height;
    }
}
