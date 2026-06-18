
public class Approach_3_Using_Recursion {
    public static void recursion(int i , int n) {
        // base case for stop the fuction.
        if (i > n) {
            return;
        }
     System.out.println(i); 
        recursion(i+1,n);

    }
    public static void main(String[] args) {
        int n =10 ;
        recursion(1,n);
    }
}
