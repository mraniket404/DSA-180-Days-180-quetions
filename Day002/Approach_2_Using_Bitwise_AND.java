import java.util.Scanner;

public class Approach_2_Using_Bitwise_AND {

    public static void even_odd(int n) {
        if ((n&1)==0) { // yaha par condition check hita he like a n&1 ye == 0 he kya tab even print hoga nahi to odd
            System.out.println(n+" is even number");
        }else{
            System.out.println(n + " is odd number");// this is for even nahi huaa to ye print hoga
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number : "); // input liya user se yaha se
        int n = sc.nextInt(); // n me store kar diya input

        even_odd(n); // this is function to check the number r even or odd
    }
}
