import java.util.Scanner;

public class Approach_3_Using_Ternary_Operator {
    public static void even_odd(int n) {
        String result = (n%2==0) ? "Even number" : "Odd number";
        System.out.println(n + " is "+ result );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();

        even_odd(n);
    }
}
