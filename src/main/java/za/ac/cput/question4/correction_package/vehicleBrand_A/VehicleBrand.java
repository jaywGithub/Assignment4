package za.ac.cput.question4.correction_package.vehicleBrand_A;

import za.ac.cput.question4.correction_package.vehicleType_B.VehicleType;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class VehicleBrand extends VehicleType {

    public String vehicleBrand(String vehicleBrand)
    {
        return vehicleBrand + vehicleType("SUV") + vehicleForm("Car");
    }
}
