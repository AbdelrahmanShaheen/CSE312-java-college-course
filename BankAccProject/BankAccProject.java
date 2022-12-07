import java.util.Scanner;

public class BankAccProject{
    public static void showMenu() {
        System.out.println("Welcome to the Account Bank mini project");
        System.out.println("1) For Deposite");
        System.out.println("2) For Withdraw");
        System.out.println("3) For getting the balance");
        System.out.println("4) For lastTransaction");
        System.out.println("5) Exit");
        System.out.println("Enter a valid number from 1--->5");
    }

    public static void run() {
        
        BankAccount acc1 = new BankAccount("shaheen", "ab123", 2000.0);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("************************************************");
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to deposite = ");
                    double amount1 = scanner.nextDouble();
                    acc1.deposite(amount1);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw = ");
                    double amount2 = scanner.nextDouble();
                    acc1.withdraw(amount2);
                case 3:
                    System.out.println("Your current balance = " + acc1.getBalance());
                case 4:
                    acc1.getLastTransaction();
            }
        }
    }
    public static void main(String[] args) {
        run();
    }
}

