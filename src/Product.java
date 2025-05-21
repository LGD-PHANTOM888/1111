public class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
    }

    double getPrice() {
        return price;
    }
}
