import java.util.*;
public class Approach_2_String_Method {
    public static int count(int num) {
        String number = Integer.toString(Math.abs(num));
        return number.length();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int n = sc.nextInt();
        System.out.println("Digits is " +count(n) );
         
    }
   
}
