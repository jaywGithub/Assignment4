package za.ac.cput.question4.testViolationPackage.vehicleType_C;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.violation_package.vehicleType_C.VehicleType;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class TestVehicleType {
    @Test
    public void testVehicleType()throws Exception
    {
        VehicleType vehicleType = new VehicleType();

        Assert.assertEquals("SUV", vehicleType.vehicleType("SUV"));
    }
}
