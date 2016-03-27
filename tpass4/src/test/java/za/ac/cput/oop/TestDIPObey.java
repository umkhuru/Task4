package za.ac.cput.oop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.DIP.Obey.Equipment;
import za.ac.cput.oop.DIP.Obey.MotorBikes;
import za.ac.cput.oop.DIP.Obey.MotorCycleModel;
import za.ac.cput.oop.DIP.Obey.MotorCyclistEquipment;
import za.ac.cput.oop.config.AppConfig;

/**
 * Created by Ethon on 3/27/2016.
 */
public class TestDIPObey {

    private ApplicationContext ctx;
    private MotorCyclistEquipment mce;
    private MotorCycleModel mcm;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mcm = (MotorBikes)ctx.getBean("DIPObey");
        mce = (Equipment)ctx.getBean("DIPObey2");

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testkawa()
    {
        double amount = mcm.Kawasaki(6);
        Assert.assertEquals(21000, amount, 5);
    }

    @Test
    public void testhonda()
    {
        double amount = mcm.Honda(3);
        Assert.assertEquals(27000, amount, 5);
    }

    @Test
    public void testDucati()
    {
        double amount = mcm.Ducati(2);
        Assert.assertEquals(100000, amount, 5);
    }

    @Test
    public void testHelmet()
    {
        double amount = mce.helmet(2);
        Assert.assertEquals(5000, amount, 5);
    }

    @Test
    public void testGloves()
    {
        double amount = mce.gloves(3);
        Assert.assertEquals(450, amount, 5);
    }

    @Test
    public void testJacket()
    {
        double amount = mce.jacket(1);
        Assert.assertEquals(850, amount, 5);
    }

    @Test
    public void testPants()
    {
        double amount = mce.pants(2);
        Assert.assertEquals(1500, amount, 5);
    }

}
