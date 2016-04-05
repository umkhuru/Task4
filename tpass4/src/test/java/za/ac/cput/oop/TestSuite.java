package za.ac.cput.oop;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by student on 2016/04/05.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EcapsulationTest.class,
        InheritanceTest.class,
        PolymorphismTest.class,
        TestDIPObey.class,
        TestDIPViolate.class,
        TestISPViolate.class,
        TestLSPObey.class,
        TestOCPObey.class,
        TestOCPViolet.class,
        TestPLKObey.class,
        TestPLKViloate.class,
        TestSRPObey.class,
        TestSRPViolate.class
})
public class TestSuite {
}
