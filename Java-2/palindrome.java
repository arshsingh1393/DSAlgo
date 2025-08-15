import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int real = sc.nextInt();
        int temp = real;
        int rev = 0;
        while (temp > 0) {
            int num = temp % 10;
            rev = rev * 10 + num;
            temp = temp / 10;
        }
        if (real == rev) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not palindrome");
        }

    }
}
