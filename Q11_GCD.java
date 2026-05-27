package summer_assignments;
import java.util.*;
public class Q11_GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,num2,a,b;
        System.out.print("Enter the Number A: ");
        num1=sc.nextInt();
        System.out.print("Enter the Number B: ");
        num2=sc.nextInt();
        a=Math.abs(num1);
        b=Math.abs(num2);
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print("GCD of "+num1+" and "+num2+" = "+a);
        sc.close();
    }
}
