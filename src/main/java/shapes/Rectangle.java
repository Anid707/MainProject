package shapes;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void draw(){
        System.out.println("I draw a rectangle with height = "+this.height+" width = "+width);
    }
    public final int getArea(){
        return width*height;
    }

    public int getHeight() {
        return height;
    }
}
