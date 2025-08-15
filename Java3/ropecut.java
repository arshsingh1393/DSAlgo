import java.util.*;

public class ropecut {
    static int rope(int n) {
        if (n <= 1) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < n; i++) {
            int singlecut = i * (n - i);
            int morecut = i * rope(n - i);
            int maxm = Math.max(singlecut, morecut);
            result = Math.max(result, maxm);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rope:");
        int l = sc.nextInt();
        int result = rope(l);
        System.out.println(result);
    }

}
