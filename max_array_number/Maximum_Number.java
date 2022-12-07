import java.util.Scanner;

public class Maximum_Number {

    public static void main(String[] args) {
        System.out.print("Enter the number of Elements : ");
        Scanner scanner = new Scanner(System.in);
        int elementsNo = scanner.nextInt();
        double[] arr = new double[elementsNo];
	//Taking elements from user
        System.out.println("Enter the Elements : ");
        for (int row = 0; row < elementsNo; row++) {
            arr[row] = scanner.nextDouble();
        }
        double maxi = arr[0];
        //finding the maximum number
	for (int row = 1; row < elementsNo; row++) {
            if(maxi < arr[row]) maxi = arr[row];
        }
	//printing the maximum number
        System.out.println("Maximum number in the array is " + maxi);
    }
}
