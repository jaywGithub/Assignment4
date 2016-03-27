package za.ac.cput.question2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestQuestion2 {
    @Test
    public void compositionTestVehicle()throws Exception
    {
        Truck truck = new Truck();
        Train train = new Train();
        Car car =  new Car();

        Assert.assertEquals(true, truck.wheels(true));
        Assert.assertEquals("Diesel", truck.eng("Diesel"));
        Assert.assertEquals(true, truck.seats(true));

        Assert.assertEquals(true, train.wheels(true));
        Assert.assertEquals("Diesel", train.eng("Diesel"));
        Assert.assertEquals(true, train.seats(true));

        Assert.assertEquals(true, car.wheels(true));
        Assert.assertEquals("Petrol", car.eng("Petrol"));
        Assert.assertEquals(true, car.seats(true));
    }
}
