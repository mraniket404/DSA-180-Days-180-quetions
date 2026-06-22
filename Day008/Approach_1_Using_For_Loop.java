// Day 8 - Factorial of a Number 
// Question 
// Ek number N diya gaya hai. Uska factorial find karo. 
// Formula 
// n! = n × (n-1) × (n-2) × ... × 1 
// Example 
// 5! = 5 × 4 × 3 × 2 × 1 
 
// = 120 


import java.util.*;
public class Approach_1_Using_For_Loop {
    public static void factorial(int num) {
        long fact = 1;
        for (int i = 1;i<=num;i++){
            fact*=i;
        }
        System.out.println(num+ " of factorial is "+fact);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        factorial(n);
    }
}
