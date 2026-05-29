package summer_assignments.DAY_11;
import java.util.*;
public class Q41_function_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int num2=sc.nextInt();
        System.out.print("Result: "+sum(num1,num2));
        sc.close();
    }
    public static int sum(int n1,int n2){
        int summ=0;
        summ=n1+n2;
        return summ;
    }
}
