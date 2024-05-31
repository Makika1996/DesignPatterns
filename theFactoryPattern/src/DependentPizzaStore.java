public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                return new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                return new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                return new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                return new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                return new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                return new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                return new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                return new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
