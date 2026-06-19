// Day 2 - Even/Odd Number Check 
// Question 
// Ek number diya gaya hai. Check karo ki number Even hai ya Odd. 

import java.util.*;
public class Approach_1_Using_Modulus_Operator {

    public static void even_odd(int n) {
        if (n % 2==0) {
            System.out.println(n+ " is a even number ");
        }else{
            System.out.println(n+ " is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        even_odd(n);
    }
}
