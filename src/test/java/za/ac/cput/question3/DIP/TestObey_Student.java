package za.ac.cput.question3.DIP;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestObey_Student {
    @Test
    public void testStudent()throws Exception
    {
        Obey_Student student = new Obey_Student();

        Assert.assertEquals("Joe", student.name("Joe"));
        Assert.assertEquals(20, student.age(20));
    }
}
