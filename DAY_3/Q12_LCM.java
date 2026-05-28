package summer_assignments.DAY_3;
import java.util.*;
public class Q12_LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,num2,a,b;
        System.out.print("Enter the Number A: ");
        num1=sc.nextInt();
        System.out.print("Enter teh Number B: ");
        num2=sc.nextInt();
        a=Math.abs(num1);
        b=Math.abs(num2);
        if(a==0 || b==0){
            System.out.print("LCM = "+0);
            sc.close();
            return;
        }
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int lcm=Math.abs(num1)*(Math.abs(num2)/a);
        System.out.print("LCM = "+lcm);
        sc.close();
    }
}
