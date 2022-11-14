package factory.implementation.abstract_method;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
