import java.util.Scanner;

public class printdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 12345;
        int temp = num;
        int div = 1;
        while (num != 0) {
            num = num / 10;
            div = div * 10;
        }
        div = div / 10;
        while(temp!=0){
        System.out.println(temp / div);
        temp = temp % div;
        div = div / 10;
        /// System.out.println(div);
        }
    }

}
//to do yourself
//7842 interchange first and last digit, 14235
