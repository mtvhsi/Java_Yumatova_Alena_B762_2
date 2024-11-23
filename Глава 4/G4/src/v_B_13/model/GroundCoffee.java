package v_B_13.model;


public class GroundCoffee extends Coffee {

    public GroundCoffee(String name, double weight, double price, double volume) {
        super(name, weight, price, volume);
    }

    @Override
    public String getType() {
        return "Молотый кофе";
    }
}
