package summer_assignments.DAY_11;
import java.util.*;
public class Q43_check_prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=sc.nextInt();
       if(prime(num1)){
           System.out.print("Entered Number is a Prime");
       }
       else {
           System.out.print("Entered Number is NOT a Prime");
       }
        sc.close();
    }
    public static boolean prime(int n1) {
        if(n1<=1){ return false; }
        for(int i=2;i*i<=n1;i++){
            if(n1%i==0){ return false; }
        }
        return true;
    }
}
