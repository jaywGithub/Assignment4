package za.ac.cput.question1.polymorphism;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Cat extends Animal implements Sound {
    @Override
    public String name(String nm)
    {
        return super.name(nm);
    }

    @Override
    public int age(int a)
    {
        return super.age(a);
    }

    @Override
    public String sound(String s) {
        return "Meow";
    }
}
