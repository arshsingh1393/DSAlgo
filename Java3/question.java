import java.util.*;

public class question {
    static void subsequences(String str, int index, String current) {
        if (index == str.length()) {
            System.out.print(current);
            return;
        }
        subsequences(str, index + 1, current + str.charAt(index));
        subsequences(str, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        System.out.println("All subsequences are:");
        subsequences(a, 0, " ");

    }
}
