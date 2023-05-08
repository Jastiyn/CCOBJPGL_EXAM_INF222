package Places;
import Explorers.Tourist;

public class Ilocos implements Locations {

    public int airFare = 250;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}