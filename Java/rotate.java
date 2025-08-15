import java.util.Scanner;

public class rotate {
    static void rotate(int a, int x) {
        int temp = a;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        if (x > count) {
            x = (x - count) % count;
        }
        temp = a;
        int first = a % (int) Math.pow(10, x);
        int last = a / (int) Math.pow(10, x);
        int swap = last * (int) Math.pow(10, x) + first;
        System.out.println("The Swapped no. is" + swap);
    }

    public static void main(String[] args) {
        int a = 12345;
        int x = 2;
        rotate(a, x);

    }

}
