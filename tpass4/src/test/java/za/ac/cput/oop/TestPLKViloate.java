package za.ac.cput.oop;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.oop.PLK.Violate.vRectangle;

/**
 * Created by Ethon on 3/27/2016.
 */
public class TestPLKViloate extends TestCase {

    vRectangle rectangle = new vRectangle(100.00, 100.00);
    //  rectangle.setWidth(100.00);



    @Test
    public void testWidth()
    {

        assertEquals(100.00, rectangle.getWidth());
    }


    @Test
    public void testHeight()
    {

        assertEquals(100.00, rectangle.getHeight());
    }





    @Test

    public void testAreaSquare()
    {
        assertEquals(10000.00, rectangle.area());
    }
}
