package summer_assignments.DAY_12;
import java.util.*;
public class Q47_fibonacci_function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long num=sc.nextLong();
        System.out.print("Result: "+fibonacci(num));
        sc.close();
    }
    public static String fibonacci(long n){
        long first=0,second=1;
        String result=" ";
        for(int i=0;i<n;i++){
             result+=" "+first;
            long next=first+second;
            first=second;
            second=next;

        }
        return result;
    }
}
