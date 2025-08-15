import java.util.Scanner;

public class primeall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prime no. from given range are:");
        int n = sc.nextInt();
        int count = 0;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\n\nTotal prime numbers are" + count);
    }
}
