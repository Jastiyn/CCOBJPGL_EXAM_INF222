package Places;
import Explorers.Tourist;

public class Cebu implements Locations {

    public int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}