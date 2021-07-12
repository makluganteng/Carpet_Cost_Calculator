package academy.learnprogramming;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double total = floor.getArea() * carpet.getCost();
        return total;
    }
}
