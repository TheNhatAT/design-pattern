package factory.implementation.simple_factory;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        //TODO
    }

    public void orderPizza() {
        Pizza pizza = this.simplePizzaFactory.createPizza("cheese");
    }
}
