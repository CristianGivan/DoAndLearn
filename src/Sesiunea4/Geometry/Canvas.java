package Sesiunea4.Geometry;

public class Canvas {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        Rectangle rectangle=new Rectangle(10,20);
        System.out.println(circle.computeArea());
        System.out.println(rectangle.computeArea());
    }
}
