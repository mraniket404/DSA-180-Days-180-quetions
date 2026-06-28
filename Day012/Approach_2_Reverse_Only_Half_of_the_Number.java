import java.util.*;
public class Approach_2_Reverse_Only_Half_of_the_Number {
    public static boolean isPalindrome(int n) {
        if (n<0) {
            return false;
        }
        if (n!=0 && n%10==0) {
            return false;
        }
        int reverse = 0 ;
        while (n > reverse) {
            int digit = n %10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return (n == reverse) || (n == reverse / 10);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    if (isPalindrome(n)) {
        System.out.println("this is Palindrome");
    }else{
        System.out.println("this is not Palindrome");
    }
   } 
}
