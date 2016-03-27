package za.ac.cput.question3.DIP;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestViolation_Student {
    @Test
    public void testStudent()throws Exception
    {
        Violation_Student student = new Violation_Student();

        Assert.assertEquals("Bob", student.name("Bob"));
        Assert.assertEquals(20, student.age(20));
    }
}
