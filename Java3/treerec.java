
import java.util.Scanner;

public class treerec {
    static void tree(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Pree call:" + n);
        tree(n - 1);
        System.out.println("Mid call:" + n);
        tree(n - 2);
        System.out.println("Post call:" + n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println(n);
    }

}
