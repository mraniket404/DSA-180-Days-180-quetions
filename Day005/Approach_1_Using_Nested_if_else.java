// Approach 1 - Using Nested if-else 
// Logic 
//  Agar a bada hai b aur c dono se → a largest  
//  Agar b bada hai a aur c dono se → b largest  
//  Warna c largest

import java.util.*;
public class Approach_1_Using_Nested_if_else {

    public static void largest_number(int n1, int n2, int n3) {
        if (n1>n2) {
            if (n1>n3) {
                System.out.println(n1 + " is largest number");
            }else{
                System.out.println(n3 + " is largest number");
            }
        }else if (n2>n3) {
            System.out.println(n2 + " is largest number");
            
        }else{
            System.out.println(n3 + " is largest number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        largest_number(num1,num2,num3);

    }
}
 