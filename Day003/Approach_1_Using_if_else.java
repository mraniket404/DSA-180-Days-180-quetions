// Day 3 - Positive, Negative, or Zero Number Check 
// Question 
// Ek number diya gaya hai. Check karo ki number: 
//  Positive hai  
//  Negative hai  
//  Ya Zero hai 

import java.util.*;

public class Approach_1_Using_if_else {

    public static void PNZ_number(int n ) {
        if (n<0) {
            System.out.println(n+ " is Negative number");
        }else if (n>0){
            System.out.println(n+ " is Positive number");
        }else{
            System.out.println(n+ " is Zero");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        PNZ_number(n);
    }
}
