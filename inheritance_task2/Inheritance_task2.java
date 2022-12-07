import java.util.Scanner;

public class Inheritance_task2 {

    public static void main(String[] args) {
        String color ,maker,brand;
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Enter color, maker and brand of the car :");
        
        color = scanner.nextLine();
        maker = scanner.nextLine();
        brand = scanner.nextLine();
        
        car.setBrand(brand);
        car.setColor(color);
        car.setMaker(maker);
        car.display();
    }
}
