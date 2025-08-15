import java.util.Scanner;

public class allprime {
    static boolean isprimeTail(int a, int b) {
        if (a <= 2)
            return (a == 2);
        if (a % b == 0)
            return false;
        if (b * b > a)
            return true;
        return isprimeTail(a, b + 1);
    }

    static void count(int first, int last) {
        if (first > last)
            return;
        if (first > 1 && isprimeTail(first, 2))
            System.out.println(first);
        count(first + 1, last);
    }

    static boolean isprimeHead(int a, int b) {
        if (a <= 2)
            return (a == 2);
        if (b * b > a)
            return true;
        if (!isprimeHead(a, b + 1))
            return false;
        if (a % b == 0)
            return false;
        return true;

    }

    static void couunt(int start, int end) {
        if (start > end)
            return;
        count(start + 1, end); // these are used here bcz head recursion passes the function first then return
        if (start > 1 && isprimeHead(start, 2))
            System.out.println(start);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting range:");
        int Starting = sc.nextInt();
        System.out.println("Enter the Ending range:");
        int Ending = sc.nextInt();
        if (Starting > Ending) {
            System.out.println("not valid");
            return;
        } else {
            System.out.println("The prime no. are:");
        }

        // couunt(Starting, Ending);
        count(Starting, Ending);
    }
}
