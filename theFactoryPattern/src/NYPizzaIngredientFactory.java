public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough;
    }

    public Sauce createSauche() {
        return new MarinaraSauce();
    }
    public Chesse createCheese() {
        return new ReggianoCheese();
    }
    public Veggie[] createVeggie() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPeppr()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clam createClam(){
        return new FreshClams();
    }
}
