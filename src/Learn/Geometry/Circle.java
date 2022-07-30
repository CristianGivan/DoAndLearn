package Learn.Geometry;

public class Circle implements Shape, Resizable {
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
        double area=PI*radius*radius;
        return area;
    }
    public void resize (double procent){
        this.radius=this.radius*procent/100;

    }
}
