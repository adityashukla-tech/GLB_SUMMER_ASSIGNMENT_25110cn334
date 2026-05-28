package summer_assignments.DAY_7;
import java.util.*;
public class Q25_Recursive_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num;
        System.out.print("Enter the Number: ");
        num=sc.nextLong();
        if(num<0){ System.out.print("Error , No factorial Exist for Negative Number");}
        else{
        System.out.print("Result: "+factorial(num));
        }
        sc.close();
    }
    public static long factorial(long n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
