
import java.util.Scanner;

public class Vowelswap {
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return s;
        char arr[] = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        String vowels = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowels.indexOf(arr[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(arr[end]) == -1) {
                end--;
            }
            char Store = arr[start];
            arr[start] = arr[end];
            arr[end] = Store;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseVowels(input);
        System.out.println("Reversed vowels string: " + result);

        sc.close();
    }
}
