import java.util.Scanner;

public class dice {
    static void dicecall(int currPos, int targetPos, String Result) {
        if (currPos == targetPos) {
            System.out.print(Result + " " + " ");
            return;
        }
        if (currPos > targetPos) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            dicecall(currPos + dice, targetPos, Result + dice);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Current position");
        int cp = sc.nextInt();
        System.out.println("Enter the target position");
        int tp = sc.nextInt();
        System.out.println("Result is:");
        dicecall(cp, tp, "");
    }

}
