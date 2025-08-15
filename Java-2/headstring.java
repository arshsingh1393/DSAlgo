import java.util.Scanner;

public class headstring {
    static String headstring(String str, int index, char oldchar, char newchar) {
        if (index == str.length()) {
            return "";
        }
        String result = headstring(str, index + 1, oldchar, newchar);
        char original = str.charAt(index);
        if (original == oldchar) {
            original = newchar;
        }
        return original + result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = sc.nextLine();
        System.out.println("Enter the Character to replace:");
        char old = sc.next().charAt(0);
        System.out.println("Enter the character to replace with");
        char latest = sc.next().charAt(0);
        String replace = headstring(a, 0, old, latest);
        System.out.println("old string:" + " " + a);
        System.out.println("new string:" + " " + replace);
        sc.close();

    }
}
