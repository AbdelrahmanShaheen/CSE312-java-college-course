import java.util.Scanner;

public class TransposeArray{

    public static void transpose(double[][] arr, double[][] oldArr) {
        for (int row = 0; row < oldArr.length; row++) {
            for (int column = 0; column < oldArr[row].length; column++) {
                arr[column][row] = oldArr[row][column];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = scanner.nextInt();
        double[][] oldArr = new double[rows][columns];
	//taking elements from user
        System.out.println("Enter the elements of the matrix :");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                oldArr[row][column] = scanner.nextDouble();
            }
        }
        double[][] transposedArr = new double[columns][rows];
	//transpose the array
        transpose(transposedArr, oldArr);
	//printing elements after transposed it.
        System.out.println("The transposed matrix :");
        for (int row = 0; row < columns; row++) {
            for (int column = 0; column < rows; column++) {
                System.out.print(transposedArr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
