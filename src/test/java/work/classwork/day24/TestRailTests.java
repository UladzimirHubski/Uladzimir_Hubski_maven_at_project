package work.classwork.day24;

import org.junit.Assert;
import org.junit.Test;

public class TestRailTests {

    @Test
    @TestCaseId(id = "156372")
    public void firstTest() throws Exception {
        Assert.assertTrue(true);
        System.out.println("1");
    }

    @Test
    @TestCaseId(id = "156373")
    public void secondTest() throws Exception {
        Assert.assertTrue(true);
        System.out.println("2");
    }

    @Test
    @TestCaseId(id = "156374")
    public void thirdTest() throws Exception {
        Assert.assertTrue(true);
        System.out.println("3");
    }

    @Test
    @TestCaseId(id = "156375")
    public void fourthTest() throws Exception {
        Assert.assertTrue(false);
        System.out.println("4");
    }


}
