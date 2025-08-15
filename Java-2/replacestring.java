import java.util.Scanner;

public class replacestring {
    static String replacestring(String str, char before, char after, int index) {
        if (index == str.length())
            return "";
        char real = str.charAt(index);
        if (real == before) {
            real = after;
        }
        return real + replacestring(str, before, after, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = sc.nextLine();
        System.out.println("Enter the Character to replace:");
        char old = sc.next().charAt(0);
        System.out.println("Enter the character to replace with");
        char latest = sc.next().charAt(0);
        String replace = replacestring(a, old, latest, 0);
        System.out.println("old string:" + " " + a);
        System.out.println("new string:" + " " + replace);

        // String real = "Hello";
        // char before = 'l';
        // char after = 'k';
        // String replace = real.replace(before, after);
        // System.out.println("old string:" + " " + real);
        // System.out.println("new string:" + " " + replace);
    }
}
