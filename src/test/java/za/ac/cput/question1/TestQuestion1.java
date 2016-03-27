package za.ac.cput.question1;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.question1.encapsulation.Encapsulation;
import za.ac.cput.question1.inheritance.CEO;
import za.ac.cput.question1.inheritance.OperationsSupervisor;
import za.ac.cput.question1.inheritance.GeneralWorker;
import za.ac.cput.question1.polymorphism.Cat;
import za.ac.cput.question1.polymorphism.Dog;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class TestQuestion1 {

    @Test
    public void testEncapsulation()throws Exception
    {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setfName("Jayson");
        encapsulation.setlName("Peters");
        encapsulation.setAge(30);

        Assert.assertEquals("Jayson", encapsulation.getfName());
        Assert.assertEquals("Peters", encapsulation.getlName());
        Assert.assertEquals(30, encapsulation.getAge());
    }

    @Test
    public void testInheritance()throws Exception
    {
        CEO ceo = new CEO();
        OperationsSupervisor operationsSupervisor = new OperationsSupervisor();
        GeneralWorker generalWorker = new GeneralWorker();

        Assert.assertEquals("John", ceo.fName("John"));
        Assert.assertEquals("Adams", ceo.lName("Adams"));
        Assert.assertEquals("Top-Level", ceo.position("Top-Level"));

        Assert.assertEquals("Bianca", operationsSupervisor.fName("Bianca"));
        Assert.assertEquals("Jones", operationsSupervisor.lName("Jones"));
        Assert.assertEquals("Mid-Level", operationsSupervisor.position("Mid-Level"));

        Assert.assertEquals("George", generalWorker.fName("George"));
        Assert.assertEquals("Williams", generalWorker.lName("Williams"));
        Assert.assertEquals("Low-Level", generalWorker.position("Low-Level"));


    }

    @Test
    public void testPolymorphism()throws Exception
    {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Assert.assertEquals("Fluffy", dog.name("Fluffy"));
        Assert.assertEquals(10, dog.age(10));
        Assert.assertEquals("Woof", dog.sound("Woof"));

        Assert.assertEquals("Waffle", cat.name("Waffle"));
        Assert.assertEquals(5, cat.age(5));
        Assert.assertEquals("Meow", cat.sound("Meow"));
    }
}
