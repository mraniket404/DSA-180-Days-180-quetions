import java.util.*;
public class Approach_4_Using_Array_Traversal {

    public static void largest_number(int arr[]) {
        int largest = arr[0];

        for (int i =1;i<arr.length;i++){
            if(arr[i] > largest) 
                largest = arr[i]; 
        }
        System.out.println(largest + " is largest number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = new int[3];
         for (int i =0;i<arr.length;i++){
            System.out.print("Enter the number "+ (i + 1) + " : ");
             arr[i] = sc.nextInt();
         }
        
        largest_number(arr);
    }
}
