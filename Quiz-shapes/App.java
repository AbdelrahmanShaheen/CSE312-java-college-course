import java.util.Scanner;
import java.util.ArrayList;

interface Shape{
    double Area();
}
abstract class TwoDimensionShape implements Shape{
    protected String dimension;
    abstract void SetDimension(String dimension);
}
abstract class ThreeDimensionShape implements Shape{
    protected String dimension;
    abstract void SetDimension(String dimension);
}
class Circle extends TwoDimensionShape{
    private double radius;
    public Circle(){}
    public Circle(double radius){
        SetRadius(radius);
    }
    public void SetDimension(String dimension){
        this.dimension = dimension;
    }
    public void SetRadius(double radius){
        if(radius > 0) this.radius = radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }
}

class Square extends TwoDimensionShape{
    private double side;
    public Square(){}
    public Square(double side){
        SetSide(side);
    }
    public void SetSide(double side){
        if(side > 0) this.side = side;
    }
    public void SetDimension(String dimension){
        this.dimension = dimension;
    }
    public double Area(){
        return side * side;
    }
}

class Sphere extends ThreeDimensionShape{
    private double radius;
    public Sphere(){}
    public Sphere(double radius){
        SetRadius(radius);
    }
    public void SetRadius(double radius){
        if(radius > 0) this.radius = radius;
    }
    public void SetDimension(String dimension){
        this.dimension = dimension;
    }
    public double Area(){
        return 4 * Math.PI * radius * radius;
    }
}

class Cube extends ThreeDimensionShape{
    private double side;
    public Cube(){}
    public Cube(double side){
        SetSide(side);
    }
    public void SetSide(double side){
        if(side > 0) this.side = side;
    }
    public void SetDimension(String dimension){
        this.dimension = dimension;
    }
    public double Area(){
        return side * side * 6;
    }
}
public class App {
    public static boolean validChoice(int choice) {
        if (choice > 5 || choice < 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int choose() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (!validChoice(choice)) {
            System.out.println("Enter a number in a given range!");
            System.out.print("Your Choice =");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public static void showMenu(ArrayList<String> menu) {
        for (String choice : menu) {
            System.out.println(choice);
        }
    }
    public static void Calculate_Area_Of_Circle(){
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter the radius of the circle : ");
        double radius = scanner.nextDouble();
        circle.SetRadius(radius);
        circle.SetDimension("2D");
        System.out.println("The Area of the circle = " + circle.Area());
    }
    public static void Calculate_Area_Of_Square(){
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();
        System.out.print("Enter the length of the circle : ");
        double length = scanner.nextDouble();
        square.SetSide(length);
        square.SetDimension("2D");
        System.out.println("The Area of the square = " + square.Area());
    }
    public static void Calculate_Area_Of_Sphere(){
        Scanner scanner = new Scanner(System.in);
        Sphere sphere = new Sphere();
        System.out.print("Enter the radius of the Sphere : ");
        double radius = scanner.nextDouble();
        sphere.SetRadius(radius);
        sphere.SetDimension("3D");
        System.out.println("The Area of the Sphere = " + sphere.Area());
    }
    public static void Calculate_Area_Of_Cube(){
        Scanner scanner = new Scanner(System.in);
        Cube cube = new Cube();
        System.out.print("Enter the length of the cube : ");
        double length = scanner.nextDouble();
        cube.SetSide(length);
        cube.SetDimension("3D");
        System.out.println("The Area of the cube = " + cube.Area());
    }
    public static void run() {
        ArrayList<String> menu = new ArrayList<String>();
        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("********************Welcome**********************");
            System.out.println("-------------------------------------------------");
            menu.add("Which shape you want to calculate the area for ?");
            menu.add("1) Circle");
            menu.add("2) Square");
            menu.add("3) Sphere");
            menu.add("4) Cube");
            menu.add("5) Exit");
            menu.add("Please choose: 1 or 2 or 3 or 4 or 5");
            showMenu(menu);
            System.out.print("Your Choice =");
            int choice = choose();
            System.out.println("*************************************************");
            if (choice == 1) {
                Calculate_Area_Of_Circle();
            } else if (choice == 2) {
                Calculate_Area_Of_Square();
            } else if (choice == 3) {
                Calculate_Area_Of_Sphere();
            }
            else if(choice == 4){
                Calculate_Area_Of_Cube();
            }
            else{
                break;
            }
            menu.clear();
        }
    }
    public static void main(String[] args) {
		run();
    }
}
