/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_task2;

public class Car extends Viechle{
    private String brand;
    Car(){}
    Car(String maker ,String color ,String brand){
        super(maker ,color);
        setBrand(brand);
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setMaker(String maker){
        this.maker = maker;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void display(){
        displayMaker();
        displayColor();
        System.out.println("The brand of the car is  : "+brand);
    }
}
