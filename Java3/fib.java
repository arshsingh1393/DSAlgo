import java.util.Scanner;

public class fib {
    static int fib(int n) {
        if (n < 2)
            return n;
        int first = fib(n - 1);
        int second = fib(n - 2);
        return first + second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Fibonacci is:" + n);

    }
}
