package za.ac.cput.question3.ISP;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestViolation_GeneralInterface {
    @Test
    public void testGeneral()throws Exception
    {
        Violation_GeneralClass violation_generalClass = new Violation_GeneralClass();

        Assert.assertEquals("Fluffy", violation_generalClass.dogName("Fluffy"));
        Assert.assertEquals("Labrador Retriever", violation_generalClass.dogBreed("Labrador Retriever"));
        Assert.assertEquals("Sedan", violation_generalClass.carType("Sedan"));
        Assert.assertEquals("Blue", violation_generalClass.carColour("Blue"));
    }
}
