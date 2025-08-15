
import java.util.*;

public class mazepath {
    static void maze(int SR, int SC, int ER, int EC, String Result) {
        if (SR == ER && SC == EC) {
            System.out.println(Result);
            return;
        }
        if (SR > ER || SC > EC) {
            return;
        }
        maze(SR, SC + 1, ER, EC, Result + "H");
        maze(SR + 1, SC, ER, EC, Result + "V");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Row:");
        int sr = sc.nextInt();
        System.out.println("Starting Column:");
        int Sc = sc.nextInt();
        System.out.println("Ending Row:");
        int er = sc.nextInt();
        System.out.println("Ending Column:");
        int ec = sc.nextInt();
        maze(sr, Sc, er, ec, "");
    }
}
