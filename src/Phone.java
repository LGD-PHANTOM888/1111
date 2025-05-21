public class Phone extends Product {
    String brand;

    Phone(String n, double p, String b) {
        super(n, p);
        brand = b;
    }

    void displayInfo() {
        System.out.println("Телефон:");
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Бренд: " + brand);
    }

}
