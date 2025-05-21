public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone", 30000, "Apple");
        Laptop laptop = new Laptop("HP", 25000, "Intel i5");
        Cart cart = new Cart();
        cart.add(phone);
        cart.add(laptop);
        cart.displayCart();
        double total = cart.getTotal();
        System.out.println("Общая сумма: " + total + " грн");
        
    }
}
