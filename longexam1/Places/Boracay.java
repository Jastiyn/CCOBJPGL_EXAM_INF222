package Places;
import Explorers.Tourist;

public class Boracay implements Locations {

    public int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}