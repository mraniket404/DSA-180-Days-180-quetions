import java.util.*;
public class Approach_2_Using_Logical_AND {
    public static void largest_number(int num1 , int num2, int num3) {
        if (num1>num2 && num1>num3) {
            System.out.println(num1 + " is largest number");
        }else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is largest number");
        }else{
            System.out.println(num3 + " is lagest number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2st number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 3st number : ");
        int n3 = sc.nextInt();

        largest_number(n1,n2,n3);
    }
}
