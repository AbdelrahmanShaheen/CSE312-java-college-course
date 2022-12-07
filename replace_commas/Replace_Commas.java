import java.util.Scanner;
public class Replace_Commas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string with commas :");
        String input = scanner.nextLine();
        String newString = input.replace(",", "");
        System.out.println("The string without commas : "+newString);
    }
}
