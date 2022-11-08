package strategy.implementation;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //polymorphism
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        FlyBehavior flyNoWay = new FlyNoWay();

        // change fly behavior at runtime
        mallard.setFlyBehavior(flyNoWay);
        mallard.performFly();
    }
}
