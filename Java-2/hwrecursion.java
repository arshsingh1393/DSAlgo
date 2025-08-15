import java.util.Scanner;

public class hwrecursion {

    static boolean isprimeTail(int n, int a) {
        if (n <= 2)
            return (n == 2);
        if (n % a == 0)
            return false;
        if (a * a > n)
            return true;
        return isprimeTail(n, a + 1);
    }

    static boolean isPrime(int n, int sum) {

        if (n <= 2)
            return (n == 2);

        if (sum * sum > n)
            return true;

        // Recursive call comes first (head recursion)
        if (!isPrime(n, sum + 1))
            return false;

        if (n % sum == 0)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number > 1 && isPrime(number, 2))
            System.out.println(number + " is prime.");
        else
            System.out.println(number + " is not prime.");

        // if (isprimeTail(num, 2))
        // System.out.println(num + " is prime.");
        // else
        // System.out.println(num + " is not prime.");
    }
}
