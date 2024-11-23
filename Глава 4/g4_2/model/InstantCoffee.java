package g4_2.model;

public class InstantCoffee extends Coffee {

    public InstantCoffee(String name, double weight, double price, double volume) {
        super(name, weight, price, volume);
    }

    @Override
    public String getType() {
        return "Растворимый кофе";
    }
}
