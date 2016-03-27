package za.ac.cput.question3.ISP;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Violation_GeneralClass implements Violation_GeneralInterface {
    @Override
    public String dogName(String dogName) {
        return dogName;
    }

    @Override
    public String dogBreed(String dogBreed) {
        return dogBreed;
    }

    @Override
    public String carType(String carType) {
        return carType;
    }

    @Override
    public String carColour(String carColour) {
        return carColour;
    }
}
