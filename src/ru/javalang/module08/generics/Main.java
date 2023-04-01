package ru.javalang.module08.generics;

public class Main {
    public static void main(String[] args) {
        Point2D<Double> point2D = new Point2D<>(10d,20d);
        Rectangle<Integer> rectangle = new Rectangle<>(10,20);
    }
}
