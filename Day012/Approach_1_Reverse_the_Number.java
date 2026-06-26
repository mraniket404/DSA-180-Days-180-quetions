// Day 12 – Palindrome Number (Part 1) 
// Aaj ka topic: 
// Check whether a Number is Palindrome or not Ye bahut common interview question hai aur logic building ke liye important hai.  
// Problem Statement 
// Ek integer n diya hai. Check karna hai ki number Palindrome hai ya nahi. Palindrome matlab: Jo number aage se aur piche se same dikhe.  
// Example 1 
// Input: 
// 121 
 
// Output: 
// Palindrome 
// Kyunki 
// 121 
 
// ↓ 
 
// 121 
// Same hai.  
// Example 2 
// Input: 
// 123 
// Reverse 
// 321 
// Different Output 
// Not Palindrome 
 
// Example 3 
// Input: 
// 1221 
// Reverse 
// 1221 
// Same Output 
// Palindrome 

import java.util.*;
public class Approach_1_Reverse_the_Number {
    public static boolean Palindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num!=0) {
            int digit = num%10;
            reverse = reverse * 10 +digit;
            num =num/10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (Palindrome(n)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");

        }
        
    }
}
