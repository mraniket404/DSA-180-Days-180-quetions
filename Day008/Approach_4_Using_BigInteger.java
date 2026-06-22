import java.math.BigInteger;
import java.util.*;
public class Approach_4_Using_BigInteger {
    public static void factorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i =1;i<=num;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num+ " of factorial is " + fact);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        factorial(n);
    }
}
