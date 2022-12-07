import java.util.Scanner;
public class Ascii_char {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the ascii number : ");
        int asciiNum = scanner.nextInt();
        System.out.println("The character is : " + (char)asciiNum);
    }
}
