import java.util.Scanner;

public class primetwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        boolean prime = true;
        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(num + "is prime no.");
        } else {
            System.out.println(num + "not prime no.");
        }

    }
}
