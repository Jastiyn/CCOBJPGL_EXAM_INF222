package Explorers;

import Places.*;
public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Baguio baguio);
    void visit(Batangas batangas);
    void visit(Cebu cebu);
    void visit(Ilocos ilocos);
    void visit(Pampanga pampanga);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
