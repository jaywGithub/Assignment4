package za.ac.cput.question3.SRP;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestDisplayAddress {
    @Test
    public void testViolationDisplayAddress()throws Exception
    {
        Violation_DisplayAddress violation_displayAddress = new Violation_DisplayAddress();

        Assert.assertEquals("District Six", violation_displayAddress.area("District Six"));
        Assert.assertEquals("Short Street", violation_displayAddress.streetName("Short Street"));
        Assert.assertEquals("26", violation_displayAddress.houseNumber("26"));
    }

    @Test
    public void testObeyDisplayAddress()throws Exception
    {
        Obey_DisplayAddress obey_displayAddress = new Obey_DisplayAddress();

        Assert.assertEquals("District Six Short Street 26", obey_displayAddress.address("District Six", "Short Street", "26"));
    }
}
