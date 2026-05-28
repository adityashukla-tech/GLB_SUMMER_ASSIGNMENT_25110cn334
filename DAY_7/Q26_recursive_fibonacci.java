package summer_assignments.DAY_7;
import java.util.*;
public class Q26_recursive_fibonacci {
    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
        long num;
        System.out.print("Enter the Number: ");
        num=sc.nextLong();
        if(num<0){
            System.out.print("No Fibonacci Series for Negative Numbers"); sc.close(); return;
        }
        else{ System.out.print("Result: ");
        for(int i=0;i<=num;i++){
        System.out.print(fibonacci(i)+" ");}
        }
            sc.close();
    }
    public static long fibonacci(long n){
        if(n==0){ return 0 ; }
        if(n==1){ return 1; }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
