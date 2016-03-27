package za.ac.cput.question1.encapsulation;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Encapsulation {

    private String fName;
    private String lName;
    private int age;

    public void setfName(String fnm)
    {
        this.fName = fnm;
    }

    public String getfName()
    {
        return fName;
    }

    public void setlName(String lnm)
    {
        this.lName = lnm;
    }

    public String getlName()
    {
        return lName;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public int getAge()
    {
        return age;
    }
}
