import java.util.*;

public class armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + "is Armstrong Number.");
        } else {
            System.out.println(num + "is not Armstrong Number.");
        }
    }
}