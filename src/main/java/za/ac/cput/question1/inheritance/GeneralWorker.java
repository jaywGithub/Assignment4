package za.ac.cput.question1.inheritance;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class GeneralWorker extends Employee {
    @Override
    public String fName(String fnm) {
        return super.fName(fnm);
    }

    @Override
    public String lName(String lnm) {
        return super.lName(lnm);
    }

    @Override
    public String position(String pos) {
        return super.position(pos);
    }
}
