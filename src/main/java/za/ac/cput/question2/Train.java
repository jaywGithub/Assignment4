package za.ac.cput.question2;

/**
 * Created by JAYSON on 2016-03-23.
 */
public class Train implements Vehicle {
    @Override
    public boolean wheels(boolean wheels) {
        return true;
    }

    @Override
    public String eng(String eng) {
        return eng;
    }

    @Override
    public boolean seats(boolean seats) {
        return true;
    }
}
