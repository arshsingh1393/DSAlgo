import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        int factors = 0;
        // Approach 1
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // factors++;
        // }
        // }
        // if (factors == 2) {
        // System.out.println("Prime no.");
        // } else {
        // System.out.println("not prime no.");
        // }
        // Approach 2
        // for (int i = 2; i*i<=num; i++) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("Prime no.");
        sc.close();
    }
}
