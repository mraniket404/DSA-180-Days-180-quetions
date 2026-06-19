import java.util.*;
public class Approach_3_Using_Ternary_Operator {
    public static void PNZ_number(int n) {
       String result = (n<0) ? " is Negative number" : (n>0)? " is Positive number":" is Zero" ;
       System.out.println(n + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int n = sc.nextInt();
        PNZ_number(n);
    }
}
