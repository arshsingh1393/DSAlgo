
import java.util.Scanner;

public class headerelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No header element");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The header element is" + arr[0]);
        sc.close();
    }

}
