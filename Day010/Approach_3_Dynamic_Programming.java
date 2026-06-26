import java.util.*;

public class Approach_3_Dynamic_Programming {

    static int[] dp;

    public static int fib(int n) {

        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fib(n - 1) + fib(n - 2);

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.print("Fibonacci Series : ");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }

    }
}