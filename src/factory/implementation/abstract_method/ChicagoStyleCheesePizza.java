package factory.implementation.abstract_method;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override()
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
