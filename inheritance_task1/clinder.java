/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_task;

/**
 *
 * @author ncm
 */
public class clinder extends Circle{
    private double height;
    clinder(double height ,double radius){
        super(radius);
        setHeight(height);
    }
    public void setHeight(double height){
        if(height > 0)
        this.height = height;
    }
    public double volume(){
        return area()*height;
    }
}
