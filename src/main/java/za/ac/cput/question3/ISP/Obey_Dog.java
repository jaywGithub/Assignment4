package za.ac.cput.question3.ISP;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Obey_Dog implements Obey_DogSpecific {
    @Override
    public String dogName(String dogName) {
        return dogName;
    }

    @Override
    public String dogBreed(String dogBreed) {
        return dogBreed;
    }
}
