import java.util.*;
public class Approach_2_Recursion {
    public static int fibonacci_series(int n) {
        if(n <= 1) 
            return n; 
 
        return fibonacci_series(n - 1) + fibonacci_series(n - 2); 

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) { 
            System.out.print(fibonacci_series(i) + " "); 
        } 
}
}
