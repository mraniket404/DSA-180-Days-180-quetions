// Day 6 - Swap Two Numbers 
// Question 
// Do numbers diye gaye hain. Unki values swap karni hain.

import java.util.*;
public class Approach_1_Using_Third_Variable {
    public static void swip_number(int num1,int num2) {
        int temp = num1 ;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int n2 = sc.nextInt();

        swip_number(n1,n2);
    }
}
