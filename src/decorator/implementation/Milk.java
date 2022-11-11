package decorator.implementation;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        double cost = beverage.cost();

        switch (beverage.getSize()) {
            case TALL:
                cost += 0.10;
                break;
            case VENTI:
                cost += 0.11;
            case GRANDE:
                cost += 0.12;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }
}
