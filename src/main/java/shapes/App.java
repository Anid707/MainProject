package shapes;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,6);

        r1.draw();
        System.out.println(r1.getArea());

        Square s1 = new Square(8);
        System.out.println(s1.getArea());

        s1.draw();
    }
}
