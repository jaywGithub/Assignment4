package za.ac.cput.question4.testCorrectionPackage.vehicleType_B;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.correction_package.vehicleType_B.VehicleType;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class TestVehicleType {
    @Test
    public void testVehicleType()throws Exception
    {
        VehicleType vehicleType = new VehicleType();

        Assert.assertEquals("Car", vehicleType.vehicleType("Car"));
    }
}
