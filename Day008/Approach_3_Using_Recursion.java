import java.util.*;
public class Approach_3_Using_Recursion {
    public static long factorial(int num) {
        if (num==0 || num==1) {
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(n + " of factorial is " + factorial(n));
    }
}
