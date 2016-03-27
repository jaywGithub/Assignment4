package za.ac.cput.question3.LSP;

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

        Assert.assertEquals("Jerry", student.name("Jerry"));
        Assert.assertEquals(10, student.age(10));
        Assert.assertEquals("Williams", student.name("Williams"));
    }
}
