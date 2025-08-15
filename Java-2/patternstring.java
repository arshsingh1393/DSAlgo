public class patternstring {
    static void printstar(int n) {
        if (n == 0)
            return;
        System.out.print("*");
        printstar(n - 1);
    }

    static void printRow(int n) {
        if (n == 0) {
            return;
        }
        printRow(n - 1);
        printstar(n);
        System.out.println();
        // printRow(n - 1);
    }

    public static void main(String[] args) {
        printRow(5);
    }
}
