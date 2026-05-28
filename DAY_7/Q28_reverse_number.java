package summer_assignments.DAY_7;
import java.util.*;
public class Q28_reverse_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long num=sc.nextLong();
        System.out.print("Result: "+reverse(num,0));
        sc.close();
    }
    public static long reverse(long n,long rev){
       if(n==0){ return rev; }
        long r=(rev*10)+(n%10);
       return reverse(n/10,r);
    }
}
