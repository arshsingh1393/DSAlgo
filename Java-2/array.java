import java.util.Scanner;

public class array {
    static void printarray(int k, int[] arr) { // printing the array elements
        if (k == arr.length) {
            return;
        }
        System.out.println(arr[k]);
        printarray(k + 1, arr);

    }

    static void printarrayloop(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static boolean arraysort(int[] arr, int j) { // checking the array is sorted or not
        if (j == arr.length - 1)
            return true;
        if (arr[j] > arr[j + 1])
            return false;

        return arraysort(arr, j + 1);

    }

    static void maxnum(int arr[], int index, int num) {
        if (index == arr.length) {
            System.out.println("Maximum value of an array is" + num);
            return;
        }
        if (arr[index] > num)
            num = arr[index];
        maxnum(arr, index + 1, num);

    }

    static int[] check(int num, int index, int arr[], int count) {
        if (index == arr.length) {
            return new int[count];
        }
        if (arr[index] == num) {
            count++;
        }
        int result[] = check(num, index + 1, arr, count);
        if (arr[index] == num) {
            result[--count] = index;

        }
        return result;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the elemnt to be count:");
        int num = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element at index" + i + ":");
            arr[i] = sc.nextInt();
        }
        // int[] arr = { 11, 2, 3, 8, 5, 10 };
        // printarrayloop(0, arr);
        // boolean flag= arraysort(arr, 0);
        if (arraysort(arr, 0)) {
            System.out.println("It is sorted");
        } else {
            System.out.println("Not sorted");
        }
        arraysort(arr, 0);
        maxnum(arr, 0, 0);
        int result[] = check(num, 0, arr, 0);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
