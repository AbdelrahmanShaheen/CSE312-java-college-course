import java.util.*;

public class QuickSort {

    public static int partition(ArrayList<Integer> arr, int l, int h) {
        int pivot = arr.get(l);
        int i = l, j = h;
        do {
            do {
                i++;
            } while (arr.get(i) <= pivot);
            do {
                j--;
            } while (arr.get(j) > pivot);

            if (i < j) {
                Collections.swap(arr, i, j);
            }
        } while (i < j);
        Collections.swap(arr, l, j);

        return j;
    }

    public static void quickSort(ArrayList<Integer> arr, int l, int h) {
        if(l < h){
        int j = partition(arr, l, h);
        quickSort(arr, l, j);
        quickSort(arr, j + 1, h);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();// [11 ,13 ,7 ,12 ,16 ,9, 24, 5, 10, 3 ,Integer.MAX_VALUE]
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+"th element :");
            Integer element = scanner.nextInt();
            arr.add(element);
        }
        arr.add(Integer.MAX_VALUE); // max value acts as a mark.
        quickSort(arr, 0, n);
        for (int idx = 0 ;idx < n; idx++) {
            System.out.print(arr.get(idx) + " ");
        }
    }
}
