// Day 7 - Sum of First N Natural Numbers 
// Question 
// Ek number N diya gaya hai. 1 se N tak sabhi numbers ka sum find karo. 

import java.util.*;
public class Approach_1_Using_Loop {
    public static void Sum_of_N(int num) {
        int sum = 0;
        for (int i =1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    Sum_of_N(n);
}
    
}
