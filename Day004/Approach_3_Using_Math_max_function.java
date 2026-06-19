import java.util.*;
public class Approach_3_Using_Math_max_function {
    public static void lagest(int n1 , int n2) {
       System.out.println(Math.max(n1,n2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number ");
        int num2 = sc.nextInt();

        lagest(num1, num2);
    }
}
