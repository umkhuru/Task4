package za.ac.cput.oop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.DIP.Violating.vMotorCycleEquipment;
import za.ac.cput.oop.DIP.Violating.vMotorCycleModel;
import za.ac.cput.oop.config.AppConfig;

/**
 * Created by Ethon on 3/27/2016.
 */
public class TestDIPViolate {

    private ApplicationContext ctx;
    private vMotorCycleEquipment mce;
    private vMotorCycleModel mcm;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mcm = (vMotorCycleModel)ctx.getBean("DIPVio2");
        mce = (vMotorCycleEquipment)ctx.getBean("DIPVio");

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
