package Teme.Geometry;

public class Circle implements Shape {
    private static final double PI =3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {

        return PI*radius*radius;
    }
}
