
import java.util.*;
public class Approach_2_Using_Nested_if {
    public static void PNZ_number(int n) {
        if (n!=0) {
            if (n<0) {
                System.out.println(n+ " is Negative number");
            }else{
                System.out.println(n+ " is Positive number");

            }
        }else{
                System.out.println(n+ " is Zero");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbre :");
        int n = sc.nextInt();

        PNZ_number(n);
    }
}
