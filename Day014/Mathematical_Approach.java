import java.util.*;
public class Mathematical_Approach {

    public static int count(int n) {
        if (n==0) {
            return 1;
        }
        int count = 0;
        while (n!=0) {
            count++;
            n/=10;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = count(n);
         int sum = 0;
         while (n!=0) {
            int digit = n%10;
            sum += Math.pow(digit,digits);
            n/=10;
         }
         return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("Armstrong number");
        }else{
            System.out.println("not Armstrong number");
        
        }
    }
}
