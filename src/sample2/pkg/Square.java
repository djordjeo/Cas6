package sample2.pkg;

public class Square extends Rectangle{

    public Square(Point point, int side) {
        super(point, side, side);
    }

    public Square(int side) {
        super(side, side);
    }

    public Square() {
        this(1);
    }

    public Square(Square other) {
        super(other);
    }

    public int getSide(){
        return getA();
    }

    @Override
    public double getArea() {
        System.out.print("Area is: ");
//        return super.getArea();
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        System.out.print("Perimeter is: ");
//        return super.getPerimeter();
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return super.toString() + " - Square with side: " + getSide() ;
    }
}
