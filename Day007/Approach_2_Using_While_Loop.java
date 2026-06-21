import java.util.*;
public class Approach_2_Using_While_Loop {
    public static void Sum_of_N(int num) {
        int sum = 0;
        int i =1;
        while (i<=num) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

         Sum_of_N(n);
    }
}
