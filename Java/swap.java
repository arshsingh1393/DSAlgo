import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int l = num % 10;
        num = num / 10;
        if (num < 10) {
            System.out.println(num + " is Not valid");
        }
        int digit = 0;
        int temp = num;
        while (num > 0) {
            num = num / 10;
            digit++;
        }
        num = temp;
        int f = num / (int) Math.pow(10, digit - 1);
        int m = num % (int) Math.pow(10, digit - 1);
        int swap = l * (int) Math.pow(10, digit) + m * 10 + f;
        System.out.println(swap);
    }
}
