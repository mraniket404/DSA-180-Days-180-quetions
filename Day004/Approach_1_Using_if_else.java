// Day 4 - Largest of Two Numbers 
// Question 
// Do numbers diye gaye hain. Dono me se bada number find karo.


import java.util.*;
public class Approach_1_Using_if_else {
    public static void largest(int num1 , int num2) {
        if (num1<num2) {
            System.out.println(num2 + " number is larger");
        }else if (num1>num2){
            System.out.println(num1 +" number is larger");

        }else {
            System.out.println("Both are equal");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();

        largest(num1,num2);

    }
}
