import java.util.Scanner;

public class positionswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int pos = 0;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            pos++;
            sum = sum + pos * (int) Math.pow(10, digit - 1);
            num = num / 10;
        }
        System.out.println(sum);
    }
}
