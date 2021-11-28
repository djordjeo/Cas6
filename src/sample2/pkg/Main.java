package sample2.pkg;

import java.util.Scanner;

public class Main {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Point point1 = new Point(4,5);
//
//        Rectangle rectangle1 = new Rectangle(1,2);
//        Rectangle rectangle2 = new Rectangle();
//        Rectangle rectangle3 = new Rectangle(point1,2,3);
//        Rectangle rectangle4 = new Rectangle(rectangle3);
//
//        System.out.println(rectangle1);
//        System.out.println(rectangle2);
//        System.out.println(rectangle3);
//        System.out.println(rectangle4);
//
//        System.out.println(rectangle1.getArea());
//        System.out.println(rectangle1.getPerimeter());
//
//        Square square1 = new Square(point1,2);
//        Square square2 = new Square();
//        Square square3 = new Square(4);
//        Square square4 = new Square(square1);
//
//        System.out.println(square1);
//        System.out.println(square2);
//        System.out.println(square3);
//        System.out.println(square4);
//
//        System.out.println(square1.getArea());
//        System.out.println(square1.getPerimeter());
//
//        Shape arr[] = {
//                new Rectangle(10,20),
//                new Rectangle(point1,100,140),
//                new Square(30),
//                new Rectangle(rectangle4),
//                new Square(new Point(4,6),60),
//        };
//        System.out.println();
//        System.out.println();
//        for(Shape el : arr){
//            System.out.println(el.getArea());
//            System.out.println(el.getPerimeter());
//        }

        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        add(rectangle);
//        System.out.println(rectangle);

        Rectangle arr[] = {
                new Rectangle(add(rectangle)),
                new Rectangle(add(rectangle)),
        };

        for(Rectangle el : arr){
            System.out.println(el);
        }

    }

    public static Rectangle add(Rectangle rectangle){
        System.out.println("Enter rectangle sides (a & b):");
        rectangle.setA(scanner.nextInt());
        rectangle.setB(scanner.nextInt());
        return rectangle;
    }

    public static void print(Rectangle rectangle){
        StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("a=").append(rectangle.getA());
        sb.append(", b=").append(rectangle.getB());
        sb.append('}');
        System.out.println(sb);
    }

}
