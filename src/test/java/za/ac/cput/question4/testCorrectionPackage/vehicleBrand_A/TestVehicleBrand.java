package za.ac.cput.question4.testCorrectionPackage.vehicleBrand_A;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question4.correction_package.vehicleBrand_A.VehicleBrand;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class TestVehicleBrand {
    @Test
    public void testVehicleBrand()throws Exception
    {
        VehicleBrand vehicleBrand = new VehicleBrand();

        Assert.assertEquals("ToyotaSUVCar", vehicleBrand.vehicleBrand("Toyota"));
    }
}
