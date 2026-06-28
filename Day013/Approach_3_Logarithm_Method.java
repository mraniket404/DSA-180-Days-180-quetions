import java.math.BigInteger;
import java.util.*;
public class Approach_3_Logarithm_Method {
    public static int count(int num) {
        if (num==0) {
            return 1;
        }
        num = Math.abs(num);
        return(int) Math.log10(num)+1;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int n = sc.nextInt();
        System.out.println("totla digits is "+count(n));
         
    }
   
}
