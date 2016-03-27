package za.ac.cput.question4.testViolationPackage.vehicle_D;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.violation_package.vehicle_D.Vehicle;

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
