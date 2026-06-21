
import java.util.Scanner;

public class Approach_3_Using_Recursion {
    public static int Sum_of_N(int num) {
        if (num==1) {
            return  1;
        }else{
            return num + Sum_of_N(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(Sum_of_N(n));
    }
}
