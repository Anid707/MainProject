package shapes;

public final class Square extends Rectangle{
    public Square(int side){
        super(side,side);
    }
    @Override
    public void draw(){
        System.out.println("I draw a square with side = "+getHeight());
    }
//    @Override
//    public int getArea(){
//        return 0;
//    }

}
