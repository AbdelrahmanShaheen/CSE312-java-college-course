package com.mycompany.task7;

public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
