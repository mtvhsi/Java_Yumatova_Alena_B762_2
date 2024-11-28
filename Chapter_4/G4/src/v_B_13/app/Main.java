package v_B_13.app;

import v_B_13.model.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Разработчик Юматова А.С. Б762-2 13 Вариант");

        Truck truck = new Truck();
        Scanner scanner = new Scanner(System.in);

        // Загрузка данных о кофе из файла
        loadCoffeeFromFile(truck, "coffee_data.txt");

        while (true) {
            System.out.println("1. Загрузить кофе");
            System.out.println("2. Показать кофе");
            System.out.println("3. Отсортировать кофе по цене за килограмм");
            System.out.println("4. Найти кофе по диапазону цен");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Введите название кофе: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите вес (кг): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Введите цену (руб.): ");
                    double price = scanner.nextDouble();
                    System.out.print("Введите объем (л): ");
                    double volume = scanner.nextDouble();

                    // Выбор типа кофе
                    System.out.print("Выберите тип кофе (1 - молотый, 2 - растворимый): ");
                    int type = scanner.nextInt();

                    Coffee coffee;
                    if (type == 1) {
                        coffee = new GroundCoffee(name, weight, price, volume);
                    } else {
                        coffee = new InstantCoffee(name, weight, price, volume);
                    }
                    truck.loadCoffee(coffee);
                    saveCoffeeToFile(coffee, "coffee_data.txt"); // Сохранение нового кофе в файл
                    break;

                case 2:
                    System.out.println("Кофе в фургоне:");
                    truck.displayCoffee();
                    break;

                case 3:
                    truck.sortByPricePerWeight();
                    System.out.println("Кофе отсортировано по цене за килограмм.");
                    break;

                case 4:
                    System.out.print("Введите минимальную цену: ");
                    double minPrice = scanner.nextDouble();
                    System.out.print("Введите максимальную цену: ");
                    double maxPrice = scanner.nextDouble();
                    System.out.println("Кофе в диапазоне цен:");
                    truck.getCoffeeInPriceRange(minPrice, maxPrice).forEach(System.out::println);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void loadCoffeeFromFile(Truck truck, String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length != 5) continue; // Пропускаем некорректные строки
                String name = parts[0];
                double weight = Double.parseDouble(parts[1]);
                double price = Double.parseDouble(parts[2]);
                double volume = Double.parseDouble(parts[3]);
                String type = parts[4].trim();

                Coffee coffee;
                if (type.equals("молотый")) {
                    coffee = new GroundCoffee(name, weight, price, volume);
                } else {
                    coffee = new InstantCoffee(name, weight, price, volume);
                }
                truck.loadCoffee(coffee);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // Метод для сохранения нового кофе в файл
    private static void saveCoffeeToFile(Coffee coffee, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            String type = coffee instanceof GroundCoffee ? "молотый" : "растворимый";
            writer.write(String.format("%s;%.2f;%.2f;%.2f;%s%n", coffee.getName(), coffee.getWeight(), coffee.getPrice(), coffee.getVolume(), type));
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
