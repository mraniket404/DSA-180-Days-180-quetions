
import java.util.Scanner;

public class Approach_4_Without_if_else {
    public static void largest(int n1 , int n2) {
        if (n1==n2) {
            System.out.println("both r equal");
        }else{
        int result = (n1+n2 + Math.abs(n1-n2))/2;
        System.out.println(result + " is largest number");
    }
}
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number ");
        int num2 = sc.nextInt();
            largest(num1,num2);
    }
}
