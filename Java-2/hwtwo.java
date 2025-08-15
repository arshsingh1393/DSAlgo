import java.util.Scanner;

public class hwtwo {
    static void reversearray(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversearray(arr, start + 1, end - 1);
    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original Array:");
        printarray(arr);
        reversearray(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Reversed array is:");
        printarray(arr);

    }
}
