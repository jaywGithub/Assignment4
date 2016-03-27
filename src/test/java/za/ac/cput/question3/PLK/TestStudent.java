package za.ac.cput.question3.PLK;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestStudent {
    @Test
    public void testStudent1()throws Exception
    {
        Student1 student1 = new Student1();

        student1.setfName("Jayson");
        student1.setlName("Peters");

        Assert.assertEquals("Jayson", student1.getfName());
        Assert.assertEquals("Peters", student1.getlName());
    }

    @Test
    public void testStudent2()throws Exception
    {
        Student2 student2 = new Student2();

        student2.setfName("Jayson");
        student2.setlName("Peters");

        Assert.assertEquals("Jayson", student2.getfName());
        Assert.assertEquals("Peters", student2.getlName());
        Assert.assertEquals("Jayson Peters", student2.display("Jayson", "Peters"));
    }
}
