import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number:");
        int num1 = sc.nextInt();
        System.out.println("Enter th length of the table:");
        int length = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            System.out.println(num1 + "*" + i + "=" + num1 * i);
        }
    }
}
