package za.ac.cput.oop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.OCP.Violate.vStudent;
import za.ac.cput.oop.config.AppConfig;

/**
 * Created by Ethon on 3/27/2016.
 */
public class TestLSPViolate {

    private ApplicationContext ctx;
    private vStudent vs;


    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        vs = (vStudent)ctx.getBean("OCPVio");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testFootballer()
    {
        Assert.assertEquals("Position is left wing", vs.FootballerPosition());
    }

    @Test
    public void testRugbyPlayer()
    {
        Assert.assertEquals("Position is Flanker", vs.RugbyPlayerPosition());
    }



}
