import java.util.*;
public class Approach_2_Using_While_Loop {

    public static void factorial(int num) {
        long fact = 1;
        int i =1;
        while (i<=num) {
            fact*=i;
            i++;
        }
        System.out.println(num + " of fcatorial is " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        factorial(n);
    }
}
