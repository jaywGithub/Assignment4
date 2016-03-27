package za.ac.cput.question3.PLK;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Run_Violation {

    public static void main(String[] args)
    {
        String student;

        Student1 student1 = new Student1();
        Student2 student2 = new Student2();

        student1.setfName("Jayson");
        student1.setlName("Peters");

        student2.setfName(student1.getfName());
        student2.setlName(student1.getlName());

        student = student2.getfName() + " " + student2.getlName();

        System.out.println(student);
    }
}
