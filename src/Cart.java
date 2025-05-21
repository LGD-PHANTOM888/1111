public class Cart {
    Product[] items = new Product[10];
    int size = 0;

    void add(Product p) {
        if (size < items.length) {
            items[size] = p;
            size++;
        } else {
            System.out.println("Ошибка");
        }
    }

    void displayCart() {
        System.out.println("Ваша корзина:");
        for (int i = 0; i < size; i++) {
            System.out.println("Товар #" + (i + 1));
            items[i].displayInfo();
            System.out.println();
        }
    }

    double getTotal() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

}
