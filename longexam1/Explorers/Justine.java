package Explorers;
import Places.Baguio;
import Places.Batangas;
import Places.Boracay;
import Places.Cebu;
import Places.Ilocos;
import Places.Pampanga;

public class Justine implements Tourist {

    static int budget = 1000;
    int fare;

    public void visit() {
        if (budget >= fare) {
            budget -= fare;
            System.out.println("Enjoying my stay");
            System.out.println("");
            checkBudget();
        }
        
    }

    public void visit(Boracay boracay) {
        // Define your visit
        fare = boracay.airFare;
        if (budget < fare) {
            System.out.println("You don't have enough budget.");
            System.out.println("You need " + boracay.airFare + " to travel Boracay");
            System.out.println("______________________________________________");
        } 
        else {
            System.out.println("You're in Boracay!");
            visit();
            System.out.println("______________________________________________");
            System.out.println("Traveling to another location.....");
            System.out.println("______________________________________________");
        }      
    }

    public void visit(Baguio baguio) {
        // Define your visit
        fare = baguio.airFare;
        if (budget < fare) {
            System.out.println("You don't have enough budget.");
            System.out.println("You need " + baguio.airFare + " to travel Baguio");
            System.out.println("______________________________________________");
        } 
        else {
            System.out.println("You're in Baguio!");
            visit();
            System.out.println("______________________________________________");
            System.out.println("Traveling to another location.....");
            System.out.println("______________________________________________");
        }
    }

    public void visit(Batangas batangas) {
        // Define your visit
        fare = batangas.airFare;
        if (budget < fare) {
            System.out.println("You don't have enough budget.");
            System.out.println("You need " + batangas.airFare + " to travel Batangas");
            System.out.println("______________________________________________");
        } 
        else {
            System.out.println("You're in Batangas!");
            visit();
            System.out.println("______________________________________________");
            System.out.println("Traveling to another location.....");
            System.out.println("______________________________________________");
        }
    }

    public void visit(Cebu cebu) {
        // Define your visit
        fare = cebu.airFare;
        if (budget < fare) {
            System.out.println("You don't have enough budget.");
            System.out.println("You need " + cebu.airFare + " to travel Cebu");
            System.out.println("______________________________________________");
        } 
        else {
            System.out.println("You're in Cebu!");
            visit();
            System.out.println("______________________________________________");
            System.out.println("Traveling to another location.....");
            System.out.println("______________________________________________");
        }
    }

    public void visit(Ilocos ilocos) {
        // Define your visit
        fare = ilocos.airFare;
        if (budget < fare) {
            System.out.println("You don't have enough budget.");
            System.out.println("You need " + ilocos.airFare + " to travel Ilocos");
            System.out.println("______________________________________________");
        } 
        else {
            System.out.println("You're in Ilocos!");
            visit();
            System.out.println("______________________________________________");
            System.out.println("Traveling to another location.....");
            System.out.println("______________________________________________");
        }
    }

    public void visit(Pampanga pampanga) {
        // Define your visit
        fare = pampanga.airFare;
        if (budget < fare) {
            System.out.println("You don't have enough budget.");
            System.out.println("You need " + pampanga.airFare + " to travel Pampanga");
            System.out.println("______________________________________________");
        } 
        else {
            System.out.println("You're in Pampanga!");
            visit();
            System.out.println("______________________________________________");
            System.out.println("Traveling to another location.....");
            System.out.println("______________________________________________");
        }
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
        if(budget == 0) {
            System.out.println("I don't have money anymore T-T");
        }
        else {
            System.out.println("I still have money to go to another trip ^_^");
        }
    }

}