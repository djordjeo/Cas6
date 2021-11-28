package sample2.pkg;

public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distance(Point point){
        return distance(this,point);
    }

    public static double distance(Point point1, Point point2){
        return Math.sqrt((point2.x-point1.x)*(point2.x-point1.x)+(point2.y-point1.y)*(point2.y-point1.y));
    }

    public void translate(int dx, int dy){
        this.x = dx;
        this.y = dy;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
