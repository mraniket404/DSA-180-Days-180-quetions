import java.util.*;
public class Approach_3_Optimal_Approach {
    public static void prime_number(int num) {
        if (num<=1) {
            System.out.println("This is not a prime number");
            return;
        }
         
        boolean prime = true;
        for (int i = 2;i * i <= num;i++){
            if (num % i ==0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        prime_number(n);
    }
}
