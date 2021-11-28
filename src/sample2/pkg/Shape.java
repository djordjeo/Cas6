package sample2.pkg;

public abstract class Shape {

    private Point point;

    public Shape(Point point){
        this.point = point;
    }

    public Shape(){
        this(new Point());
    }

    public Shape(Shape shape){
        this.point = shape.point;
    }

    public Point getPoint() {
        return point;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("point=").append(getPoint());
        sb.append('}');
        return sb.toString();
    }
}
