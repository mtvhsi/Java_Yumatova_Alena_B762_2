import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Otdel> otdels;

    public Shop(String name) {
        this.name = name;
        this.otdels = new ArrayList<>();
    }

    public void addOtdel(String otdelName) {
        otdels.add(new Otdel(otdelName));
    }

    public void addProductToOtdel(String otdelName, String productName, double price) {
        for (Otdel otdel : otdels) {
            if (otdel.getName().equalsIgnoreCase(otdelName)) {
                otdel.addProduct(new Product(productName, price));
            }
        }
    }

    public void addServiceToOtdel(String otdelName, String serviceName, double price) {
        for (Otdel otdel : otdels) {
            if (otdel.getName().equalsIgnoreCase(otdelName)) {
                otdel.addService(new Service(serviceName, price));
            }
        }
    }

    class Otdel {
        private String name;
        private List<Product> products;
        private List<Service> services;

        public Otdel(String name) {
            this.name = name;
            this.products = new ArrayList<>();
            this.services = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void addService(Service service) {
            services.add(service);
        }

        @Override
        public String toString() {
            return "Отдел: " + name + ", Товар: " + products + ", Услуга : " + services;
        }
    }

    class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " ($" + price + ")";
        }
    }

    class Service {
        private String name;
        private double price;

        public Service(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " ($" + price + ")";
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop("Супермаркет");
        
        shop.addOtdel("Электроника");
        shop.addProductToOtdel("Электроника", "Телевизор", 500);
        shop.addServiceToOtdel("Электроника", "Установка", 50);
        shop.addProductToOtdel("Электроника", "Смартфон", 300);
        shop.addServiceToOtdel("Электроника", "Ремонт", 100);
        shop.addServiceToOtdel("Электроника", "Настройка", 30);

        shop.addOtdel("Продукты");
        shop.addProductToOtdel("Продукты", "Яблоко", 0.5);
        shop.addProductToOtdel("Продукты", "Хлеб", 1.0);
        shop.addProductToOtdel("Продукты", "Молоко", 1.5);
        shop.addServiceToOtdel("Продукты", "Доставка", 5);
        shop.addServiceToOtdel("Продукты", "Упаковка", 2);

        shop.addOtdel("Одежда");
        shop.addProductToOtdel("Одежда", "Футболка", 15);
        shop.addProductToOtdel("Одежда", "Джинсы", 40);
        shop.addServiceToOtdel("Одежда", "Пошив", 20);
        shop.addServiceToOtdel("Одежда", "Стиральные услуги", 10);

        for (Otdel otdel : shop.otdels) {
            System.out.println(otdel);
        }
    }
}
