package Teme.Geometry;

public class Rectangle implements Shape {

    private double length;
    private double wight;

    public Rectangle(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return this.wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
    public double computeArea(){
        return this.length*this.wight;
    }
}
