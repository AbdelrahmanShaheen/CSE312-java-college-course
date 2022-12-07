import java.util.Scanner;

public class Inheritance_task {

    public static void main(String[] args) {
        double height ,radius;
        System.out.println("Enter height and radius : ");
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextDouble();
        radius = scanner.nextDouble();
        clinder cl = new clinder(height ,radius);
        System.out.println("Volume of clinder = " + cl.area());
    }
}
