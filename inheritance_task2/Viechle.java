/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_task2;

public class Viechle {
    protected String maker;
    protected String color;
    Viechle(){}
    Viechle(String maker ,String color){
        this.maker = maker;
        this.color = color;
    }
    protected void displayMaker(){
        System.out.println("The maker of the viechle is : "+maker);
    }
    protected void displayColor(){
        System.out.println("The color of the viechle is : "+color);
    }
}
