import java.util.*;
public class Approach_3_Reverse_Integer_with_Overflow {

    public static int reverse_number(int num) {
        int reverse = 0;
        while (num!=0) {
            int digit = num%10;// last digit find karne ke liye
            //positive overflow
            if (reverse>Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && digit > 7) ) {
                return 0 ;
            }

            //Negative Overflow
            if (reverse<Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && digit < -8) ) {
                return 0 ;
            }
            reverse = reverse*10+digit; // store karne ke liye 
            num= num/10; // last digit remove karne ke liye 
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
       System.out.println(reverse_number(n)); 
    }
}
