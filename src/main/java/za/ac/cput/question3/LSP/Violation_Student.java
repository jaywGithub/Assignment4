package za.ac.cput.question3.LSP;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Violation_Student implements Violation_Person {
    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public int age(int age) {
        return age;
    }

    public String surname(String surname)
    {
        return surname;
    }
}
