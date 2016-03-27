package za.ac.cput.question4.testCorrectionPackage.vehicle_C;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.correction_package.vehicle_C.Vehicle;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class TestVehicle {
    @Test
    public void testVehicle()throws Exception
    {
        Vehicle vehicle = new Vehicle();

        Assert.assertEquals("Car", vehicle.vehicleForm("Car"));
    }
}
