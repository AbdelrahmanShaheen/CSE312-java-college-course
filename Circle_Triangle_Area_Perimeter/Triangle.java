package com.mycompany.task7;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1 ,double side2 ,double side3){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }
    public void setSide1(double side1){
        if(side1 > 0)
        this.side1 = side1;
    }
    public void setSide2(double side2){
        if(side2 > 0)
        this.side2 = side2;
    }
    public void setSide3(double side3){
        if(side3 > 0)
        this.side3 = side3;
    }
    public double calcPerimeter(){
        return side1 + side2 + side3;
    }
    public double calcArea(){
        double s = calcPerimeter() / 2;
        return Math.sqrt(s*(s-side1)*(s - side2)*(s - side3));
    }
}
