package ru.javalang.module07.geometry;

public class Rectangle extends GraphicObject {
    private double a;
    private double b;
    private Point2D point2D;

    public Rectangle() {
        this.point2D = new Point2D(0,0);
    }

    public Rectangle(double a) {
        this();
        this.a = a;
        this.b = a;
    }

    public Rectangle(double a, double b) {
        this();
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, Point2D point2D) {
        this(a,b);
        this.point2D = point2D;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(Point2D point2D) {
        this.point2D = point2D;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник с параметрами: " + this.toString());

    }

    @Override
    public String toString() {
        return "{" +
                "a=" + a +
                ", b=" + b +
                ", point2D=" + point2D +
                '}';
    }
}
