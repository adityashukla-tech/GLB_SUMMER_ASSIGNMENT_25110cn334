package summer_assignments.DAY_7;
import java.util.*;
public class Q27_recursive_sum_ofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long num=sc.nextLong();
        num=Math.abs(num);
        System.out.print("Result: "+digits(num));
        sc.close();
    }
    public static long digits(long n){
        if(n==0){ return 0;}
         return (n%10)+(digits(n/10));
    }
}
