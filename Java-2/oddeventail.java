import java.util.Scanner;

public class oddeventail {
    static void oddeventail(int num, int eventcount, int oddcout) {
        if (num == 0) {
            System.out.println("Event count is" + eventcount);
            System.out.println("Odd count is" + oddcout);
            return;
        }
        if (num % 2 == 0) {
            eventcount++;
        } else {
            oddcout++;
        }
        oddeventail(num - 1, eventcount, oddcout);

    }

    // static int[] oddevenarr(int num) {
    // int[] arr = new int[]{2,3};
    // int arr[]={1,2,3,4};
    // int[] arr=new int[2];
    // }
    static int[] oddevenHead(int num) {
        if (num == 0) {
            int arr[] = new int[2];
            return arr;
        }
        int[] result = oddevenHead(num - 1);
        if (num % 2 == 0) {
            result[0]++;
            // result[0]+=1;
        } else {
            result[1]++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start Range of number:");
        int num = sc.nextInt();
        // oddeventail(num, 0, 0);

        // System.out.println("Enter the End range of number:");
        // int end = sc.nextInt();
        int[] result = oddevenHead(num);
        System.out.println("The event count is" + result[0]);
        System.out.println("The odd count is" + result[1]);
    }
}
