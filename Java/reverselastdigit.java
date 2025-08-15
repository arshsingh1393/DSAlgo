import java.util.Scanner;

public class reverselastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp=num;
      
       if (num < 10) {
        System.out.println(num);
        return;
    }
    
    int digits = 0;
    int first = 0;
    int last = num % 10;
    temp = num;
    
    
    while (temp > 0) {
        first = temp;
        temp =temp/ 10;
        digits++;
    }
    
    
    int swap = last * (int)Math.pow(10, digits-1) + (num % (int)Math.pow(10, digits-1)) / 10 * 10+ first;

    System.out.println(swap);
    }
}
