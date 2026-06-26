import java.util.*;
public class Approach_2_String_Method {
    public static int reverse_number(int num) {
        boolean negative = false;
        if (num<0) {
            negative=true;
            num = -num;

        }
            String s = Integer.toString(num);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            int ans = Integer.parseInt(sb.toString());
            if (negative) {
                ans = -ans;
            }
            return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

       System.out.println( reverse_number(n));
    }
}
