import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
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
            System.out.println("Armstrong no.");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
