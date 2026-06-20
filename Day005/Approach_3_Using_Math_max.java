import java.util.*;
public class Approach_3_Using_Math_max {
    public static void largest_number(int num1 , int num2 , int num3){
        int result = Math.max(num1,Math.max(num2,num3));
        System.out.println(result + " is largest number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2st number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 3st number : ");
        int n3 = sc.nextInt();

        largest_number(n1 ,n2,n3);
    }
}
