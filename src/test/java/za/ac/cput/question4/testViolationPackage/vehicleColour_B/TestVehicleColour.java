package za.ac.cput.question4.testViolationPackage.vehicleColour_B;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.violation_package.vehicleColour_B.VehicleColour;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class TestVehicleColour {
    @Test
    public void testVehicleColour()throws Exception
    {
        VehicleColour vehicleColour = new VehicleColour();

        Assert.assertEquals("Red", vehicleColour.vehicleColour("Red"));
    }
}
