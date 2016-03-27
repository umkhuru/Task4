package za.ac.cput.oop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.config.AppConfig;
import za.ac.cput.oop.polymorphism.Student;

/**
 * Created by Ethon on 3/27/2016.
 */
public class PolymorphismTest {

    private ApplicationContext ctx;
    private Student st;


    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        st = (Student)ctx.getBean("poly");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testJob()
    {
        // st.job();
        Assert.assertEquals("You truly are great at your job sir", st.job());
    }


}
