package factory.implementation.abstract_method;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
