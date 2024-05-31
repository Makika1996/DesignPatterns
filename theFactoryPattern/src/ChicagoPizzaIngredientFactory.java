public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough;
    }

    public Sauce createSauche() {
        return new PlumTomatoSauce();
    }
    public Chesse createCheese() {
        return new MozzarellaCheese();
    }
    public Veggie[] createVeggie() {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clam createClam(){
        return new FrozenClams();
    }
}
