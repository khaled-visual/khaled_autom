package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void simpleTest() {
        System.out.println("Khaled automation test is running");
        Assert.assertTrue(true);
    }
}
