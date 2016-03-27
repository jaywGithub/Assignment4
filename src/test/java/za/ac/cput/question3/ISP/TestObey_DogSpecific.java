package za.ac.cput.question3.ISP;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestObey_DogSpecific {
    @Test
    public void testDog()throws Exception
    {
        Obey_Dog obey_dog = new Obey_Dog();

        Assert.assertEquals("Fluffy", obey_dog.dogName("Fluffy"));
        Assert.assertEquals("Labrador Retriever", obey_dog.dogBreed("Labrador Retriever"));
    }
}
