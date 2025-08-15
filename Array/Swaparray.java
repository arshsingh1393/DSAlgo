import java.util.Scanner;

public class Swaparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println("Swapped Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
