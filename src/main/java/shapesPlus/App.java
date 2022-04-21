package shapesPlus;

public class App {
    public static void main(String[] args) {
//        Shape shape = new Shape();
        Circle c1 = new Circle(5);
        Shape c2 = new Circle(8);

        Rectangle r1 = new Rectangle(9,4);
        Shape r2 = new Rectangle(8,3);

        Square s1 = new Square(5);
        Rectangle s2 = new Square(9);
        Shape s3 = new Square(7);

        Shape[] shapes = {c1,c2,r1,r2,s1,s2,s3};
        double area = 0;

        for (Shape shape : shapes){
            area = area+shape.getArea();
        }
        System.out.println(area);


        for (Shape shape :shapes){
            shape.draw();
        }

        double length = 0;
        for (Shape shape: shapes){
            length = length+shape.getPerimeter();
        }
        System.out.println(length);
    }
}
