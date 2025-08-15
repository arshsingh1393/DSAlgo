
//revursion is function which call itself again and again
//recursion is bidirectional
//stack overflow when the no space is left in the stack
//if it is not static then we have to make a object and then call
// recursion three things....1- small problems, 2- base case/terminate, 3- main logic
// return is used to exit the function instantly
// stack building case- first call function then return
//type of recursion...1-direct- when a single fuctrion call itself again & again , 2-indirect-rarely used recursion
// 3 types of direct recursion-{
//     1- head recursion- first calling the function then the wroks start doing
//     2- tail recursion- when work is done first and calling happens in last
//     3- tree recursion-when a single function is call two or more times in part of branches
// }
import java.util.*;

public class recursion {

    static void printrevnumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printrevnumber(n - 1);

    }

    static void printnum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printnum(n + 1);

    }

    static void printall(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printall(n - 1);
        System.out.println(n);
    }

    static void factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);

    }

    static void facTail(int n, int fact) {
        if (n == 1) {
            System.out.println("The factorial is" + fact);
            return;
        }
        facTail(n - 1, fact * n);

    }

    static int factHead(int n) {
        if (n == 1)
            return 1;
        int ans = factHead(n - 1);
        return ans * n;

    }

    public static void main(String[] args) {
        // int a=10;
        // System.out.println("Hello");
        // printnumber(5);
        // printrevnumber(5);
        // printnum(1);
        // factorial(10);
        int n = 5;
        System.out.println("factorial:" + factHead(5));
    }
}
