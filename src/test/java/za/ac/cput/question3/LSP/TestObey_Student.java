package za.ac.cput.question3.LSP;

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

        Assert.assertEquals("Anthony", student.name("Anthony"));
        Assert.assertEquals(30, student.age(30));
    }
}
