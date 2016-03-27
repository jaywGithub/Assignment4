package za.ac.cput.question4.testViolationPackage.vehicleBrand_A;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.violation_package.vehicleBrand_A.VehicleBrand;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class TestVehicleBrand {
    @Test
    public void testVehicleBrand()throws Exception
    {
        VehicleBrand vehicleBrand = new VehicleBrand();

        Assert.assertEquals("ToyotaSUVRedCar", vehicleBrand.vehicleBrand("Toyota"));
    }
}
