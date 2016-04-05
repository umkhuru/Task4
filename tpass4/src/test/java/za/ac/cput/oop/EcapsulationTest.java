package za.ac.cput.oop;

import org.junit.*;
import za.ac.cput.oop.encapsulation.SoccerPlayerInformation;

/**
 * Created by Ethon on 3/27/2016.
 */
public class EcapsulationTest {

    private static SoccerPlayerInformation c;
    public EcapsulationTest() {
    }
    @Test
    public void encapTest() {
        Assert.assertEquals("Thomas", c.getName());
        Assert.assertEquals("Striker", c.getPosition());
        //Assert.assertEquals("36", c.getAge());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        c = new SoccerPlayerInformation();
        c.setName("Thomas");
        c.setPosition("Striker");
        //c.setAge("36");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }


}
