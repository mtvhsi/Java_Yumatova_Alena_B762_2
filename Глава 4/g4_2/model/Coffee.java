package g4_2.model;

public abstract class Coffee {
    protected String name;
    protected double weight; // вес в кг
    protected double price; // цена в рублях
    protected double volume; // объем в литрах

    public Coffee(String name, double weight, double price, double volume) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%s: %.2f кг, %.2f руб., Объем: %.2f л", name, weight, price, volume);
    }
}
