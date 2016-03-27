package za.ac.cput.question4.violation_package.vehicleBrand_A;

import za.ac.cput.question4.violation_package.vehicleType_C.VehicleType;

/**
 * Created by JAYSON on 2016-03-24.
 */
public class VehicleBrand extends VehicleType {

    public String vehicleBrand(String vehicleBrand)
    {
        return vehicleBrand + vehicleType("SUV") + vehicleColour("Red") + vehicleForm("Car");
    }
}
