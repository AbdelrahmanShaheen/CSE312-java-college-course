import java.util.Scanner;

public class Task7 {

    public static void runTriangleProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Triangle program");
        System.out.println("Enter the 3 sides of the triangle to calculate Area and Perimeter");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle tr = new Triangle(side1, side2, side3);
        System.out.println("The Area is : " + tr.calcArea());
        System.out.println("The Perimeter is : " + tr.calcPerimeter());
    }
    public static void runCircleProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Circle program");
        System.out.println("Enter the radius of the circle to calculate Area and Perimeter");
        double radius = scanner.nextDouble();
        Circle cl = new Circle(radius);
        System.out.println("The Area is : " + cl.calcArea());
        System.out.println("The Perimeter is : " + cl.calcPerimeter());
    }
    public static void main(String[] args) {
        System.out.println("Enter 1)for Triangle program ,2)for Circle");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        switch (type) {
            case 1:
                runTriangleProgram();
                break;
            case 2:
                runCircleProgram();
                break;
        }
    }
}
