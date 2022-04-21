package lesson9;

public class App1 {
    public static void main(String[] args) {
        Tickets child = new Tickets(5,500);
        System.out.println(child.calculatePrice());
    }
}
