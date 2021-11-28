package sample2.pkg;

public class Rectangle extends Shape{

    private int a, b;

    public Rectangle(Point point, int a, int b) {
        super(point);
        init(a,b);
    }

    public Rectangle(int a, int b){
        super();
        init(a,b);
    }

    public Rectangle(){
        this(1,1);
    }

    public Rectangle(Rectangle other){
        super(other);
        init(other.a,other.b);
    }

    private void init(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        System.out.print("Area is: ");
        return a*b;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Perimeter is: ");
        return 2*(a+b);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append('}');
        return super.toString() + sb.toString();
    }

}
