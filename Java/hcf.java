import java.util.*;

public class hcf {
    static void Hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The HCF is" + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First no.");
        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        Hcf(a, b);
    }
}