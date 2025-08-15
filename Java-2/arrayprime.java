import java.util.Scanner;

public class arrayprime {
    static int[] prime(int num1, int num2, int length, int array[]) {
        if (num1 >= num2)
            return array;
        if (isarrayprime(num2, 2)) {
            array[length] = num2;
            return arrayprime(num1, num2 + 1, length + 1, array);
        } else {
            return arrayprime(num1, num2 + 1, length, array);
        }
    }

    static int[] primelength(int n) {
        int[] arr = new int[countprime(n, 2, 0)];
        prime(n, 2, 0, arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the range of prime numbers:" + countprime(number, 2, 0));
        int[] primenum = primelength(number);
        for (int i = 0; i < primenum.length; i++) {
            System.out.println(primenum[i] + "");
        }

    }
}
