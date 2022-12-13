package com.mycompany.project;

public class Cylinder extends Circle{
    private double height = 1.0;
    
    public Cylinder(){}
    public Cylinder(double height){
        setHeight(height);
    }
    public Cylinder(double height ,double radius){
        super(radius);
        setHeight(height);
    }
    public Cylinder(double height ,double radius ,String color){
        super(radius ,color);
        setHeight(height);
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        if(height > 0)
        this.height = height;
    }
    public String toString(){
        return super.toString() + height + "\n";
    }
    public double getVolume(){
        return getArea() * height;
    }
}
