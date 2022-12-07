import java.util.Scanner;

public class NCR_NPR {

    public static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static int nCr(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Enter r : ");
        int r = scanner.nextInt();
        System.out.println("nCr = " + nCr(n, r));
        System.out.println("nPr = " + nPr(n, r));
    }
}
