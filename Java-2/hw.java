import java.util.Scanner;

// import javax.naming.spi.DirStateFactory.Result;

public class hw {
    static int PalindromeHead(int n, int rev) { // head and tail is opposite in this all codes
        if (n == 0) {
            return rev;
        }
        int last = n % 10;
        rev = rev * 10 + last;
        return PalindromeHead(n / 10, rev);
    }

    static int Palindrometail(int n, int rev) {
        if (n == 0)
            return rev;
        return PalindromeHead(n / 10, rev * 10 + n % 10);

    }

    static int armstrongtail(int n, int pow, int sum) {
        if (n == 0)
            return sum;
        int num = n % 10;
        return armstrongtail(n / 10, pow, sum + (int) Math.pow(num, pow));
    }

    static int countdigit(int n) {
        return (n == 0) ? 0 : 1 + countdigit(n / 10);
    }

    static int ArmstrongHeadRecursion(int num, int power) {
        if (num == 0)
            return 0;
        int sum = ArmstrongHeadRecursion(num / 10, power);
        int digit = num % 10;
        sum += Math.pow(digit, power);
        return sum;
    }
    // Counts digits helper for the power
    static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int number = sc.nextInt();
        // int digit = countdigit(number);
        // int result = armstrongtail(number, digit, 0);

        // int reverse = Palindrometail(number, 0);
        // System.out.println(reverse ? " palindrome" : "not palindrome");

        // if (number == result) {
        // System.out.println(number + "is palindrome");
        // } else {
        // System.out.println(number + "is not palindrome");
        // }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int digits = countDigits(number);
        int sum = ArmstrongHeadRecursion(number, digits);

        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
