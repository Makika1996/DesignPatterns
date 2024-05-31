public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        // code to print pizza details
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough).append("\n");
        }
        if (sauce != null) {
            result.append(sauce).append("\n");
        }
        if (cheese != null) {
            result.append(cheese).append("\n");
        }
        if (veggies != null) {
            for (Veggies veggies : veggies) {
                result.append(veggies).append(", ");
            }
            result.setLength(result.length() - 2); // Remove last comma and space
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni).append("\n");
        }
        if (clam != null) {
            result.append(clam).append("\n");
        }
        return result.toString();
    }
}

interface Dough {}
interface Sauce {}
interface Veggies {}
interface Cheese {}
interface Pepperoni {}
interface Clam {}
