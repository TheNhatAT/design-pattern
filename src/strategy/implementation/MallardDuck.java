package strategy.implementation;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Mallard Duck showed!!!");
    }
}
