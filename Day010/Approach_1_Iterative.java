// Day 10 - Fibonacci Series ⭐ 
// Question 
// Fibonacci Series print karo. 
// Fibonacci Series Kya Hai? 
// Har number: 
// Previous 2 numbers ka sum 
// hota hai. 

import java.util.*;
public class Approach_1_Iterative{
    public static void fibonacci_series(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i=3;i<=num;i++){
            int c  = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        fibonacci_series(n);
    }

}