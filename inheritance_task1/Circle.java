package com.mycompany.inheritance_task;

public class Circle {
    protected double radius;
    Circle(double radius){
    setRadius(radius);
    }
    protected void setRadius(double radius){
        if(radius > 0)
            this.radius = radius;
    }
    protected double area(){
     return radius*radius*3.14;   
    }
}
