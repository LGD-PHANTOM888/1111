public class Laptop extends Product {
    String processor;

    Laptop(String n, double p, String pr) {
        super(n, p);
        processor = pr;
    }

    void displayInfo() {
        System.out.println("Ноутбук:");
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Процессор: " + processor);
    }
}
