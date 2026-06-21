import java.util.*;
public class Approach_4_Formula_Method {
    public static void Sum_of_N(int num) {
        int sum = num * (num+1) /  2 ;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        Sum_of_N(n);

    }
}
