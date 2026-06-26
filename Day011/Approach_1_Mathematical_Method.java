// Day 11 — Reverse a Number (Part 1) 
// Problem Statement 
// Ek integer n diya hai. Uske digits ko reverse karke return karo. 
// Example 1 
// Input: 
// 12345 
 
// Output: 
// 54321 
// Example 2 
// Input: 
// 9070 
 
// Output: 
// 709 
// Leading zero automatically remove ho jate hain. 

import java.util.*;
public class Approach_1_Mathematical_Method {
    public static int reverse_num(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
       
       System.out.println(reverse_num(n)); 
    }
}
