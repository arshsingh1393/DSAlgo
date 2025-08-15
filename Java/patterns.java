public class patterns {
    static void oppositepyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= 1; k--) {
                System.out.println("* ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        oppositepyramid(n);

    }
}
