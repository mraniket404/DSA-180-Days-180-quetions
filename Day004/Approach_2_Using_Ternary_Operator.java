import java.util.*;
public class Approach_2_Using_Ternary_Operator {

    public static void largest(int num1 ,int num2) {
      String  result = (num1<num2) ? num2 + " is lagest number" :(num1>num2) ? num1 + " is lagest number":"Both are equal";
      System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        largest(num1,num2);
    }
}
