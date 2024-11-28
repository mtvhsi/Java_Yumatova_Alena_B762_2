package v_B_13.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Truck {
    private List<Coffee> coffeeList;

    public Truck() {
        this.coffeeList = new ArrayList<>();
    }

    public void loadCoffee(Coffee coffee) {
        coffeeList.add(coffee);
    }

    public void sortByPricePerWeight() {
        Collections.sort(coffeeList, Comparator.comparingDouble(c -> c.getPrice() / c.getWeight()));
    }

    public List<Coffee> getCoffeeInPriceRange(double minPrice, double maxPrice) {
        List<Coffee> result = new ArrayList<>();
        for (Coffee coffee : coffeeList) {
            if (coffee.getPrice() >= minPrice && coffee.getPrice() <= maxPrice) {
                result.add(coffee);
            }
        }
        return result;
    }

    public void displayCoffee() {
        coffeeList.forEach(System.out::println);
    }
}
