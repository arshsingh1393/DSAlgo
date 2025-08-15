
import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();
        int k = removeElement(arr, val);

        System.out.println("Number of elements not equal to " + val + " = " + k);
        System.out.print("New array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + "_");
        }
    }
}
