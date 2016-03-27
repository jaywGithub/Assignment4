package za.ac.cput.question3.OCP;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestPuppy {
    @Test
    public void testViolationPuppy()throws Exception
    {
        Violation_Puppy puppy = new Violation_Puppy();

        Assert.assertEquals("Labrador Retriever", puppy.getBreed());
    }

    @Test
    public void testObeyPuppy()throws Exception
    {
        Obey_Puppy puppy = new Obey_Puppy();

        Assert.assertEquals("Labrador Retriever", puppy.breed("Labrador Retriever"));
    }
}
