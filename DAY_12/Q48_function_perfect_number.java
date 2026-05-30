package summer_assignments.DAY_12;
import java.util.*;
public class Q48_function_perfect_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
       long num=sc.nextLong();
       if(perfect(num)){
           System.out.print("Result: The Number is Perfect");
       }
       else { System.out.print("Result: The Number is NOT Perfect");}
           sc.close();
    }
    public static boolean perfect(long n){
        long sum=0;
        if(n<=1){ return false;}
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}
