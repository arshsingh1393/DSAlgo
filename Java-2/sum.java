// method overloading- when we make to function with same name but with different parameters/arguments.

import java.util.Scanner;

public class sum {
    static void SumofdigitTail(int n, int sum) {
        if (n == 0) {
            System.out.println("sum of digits:" + sum);
            return;
        }
        int digit = n % 10;
        sum += digit;
        n = n / 10;
        SumofdigitTail(n, sum);
    }

    static int SumofdigitHead(int sum) {
        if (sum == 0) {

            return 0;
        }
        // int temp = SumofdigitHead(sum / 10);
        // int rem = sum % 10;
        // temp += rem;
        // return temp;
        return SumofdigitHead(sum / 10) + sum % 10;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        // SumofdigitTail(num, 0);
        System.out.println("the Sum of Digit is:" + SumofdigitHead(num));

    }
}
