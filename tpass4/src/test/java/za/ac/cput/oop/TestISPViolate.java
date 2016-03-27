package za.ac.cput.oop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.ISP.Obeying.BestExamResults;
import za.ac.cput.oop.ISP.Obeying.TopStudent;
import za.ac.cput.oop.config.AppConfig;

/**
 * Created by Ethon on 3/27/2016.
 */
public class TestISPViolate {

    private ApplicationContext ctx;
    private BestExamResults exam;


    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        exam= (TopStudent)ctx.getBean("ISPObey");


    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testGK()
    {
        // Boolean results = exam.leader() == true && exam. == true && gk.Saves() == true;
        //Assert.assertEquals(true, results);
    }
}
