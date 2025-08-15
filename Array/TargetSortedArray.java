
import java.util.Scanner;

public class TargetSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TargetSortedArray obj = new TargetSortedArray();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int result[] = obj.twoSum(arr, target);
        if (result.length == 0) {
            System.out.println("no two numbers found");
        } else {
            System.out.println("Target: " + result[0] + ", " + result[1]);
        }

    }
}
