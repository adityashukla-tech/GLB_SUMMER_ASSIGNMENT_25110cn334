package summer_assignments.DAY_11;
import java.util.*;
public class Q44_function_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=sc.nextInt();
        System.out.print("Result: "+factorial(num1));
        sc.close();
    }
    public static int factorial(int n){
        int result = 1;
        if(n<0){
            return 0 ;
        }
        else if(n==0) {
            return 1;
        }
        else {
            for (int i = 1; i <=n; i++) {
                result =result * i;
            }
            return result;
        }
    }
}
