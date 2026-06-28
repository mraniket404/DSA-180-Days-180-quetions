// Day 13 – Count Digits in a Number (Part 1) 
// Aaj ka topic: 
// Count Digits in a Number Ye Basic Mathematics ka bahut important topic hai. Iska logic aage chal kar Reverse 
// Number, Armstrong Number, Palindrome Number, Digit Sum, Digital Root, aur kai 
// interview questions me use hoga.  
// Problem Statement 
// Ek integer n diya hai. Usme total kitne digits hain, wo count karna hai. 


import java.util.*;
public class Approach_1_Division_by_10 {
    public static int count(int num) {
        if (num == 0) {
            return  1; // 0 hoga to return karega 1
        }
        num = Math.abs(num); // agar -ve number hoga to use +ve bana dega ye 
        int count = 0; 
        while (num!=0) { // agar number 0 nahi to loop ke undar
            count ++;// count badayega 1 se
            num/=10; // last digit remove karega
        }

        return count; // total count return karega 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nummber : ");
        int n = sc.nextInt();

        System.out.println("total digits is "+count(n));
    }
}
