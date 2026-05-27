package summer_assignments;
import java.util.*;
public class Q5_Sum_digits {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num,r,result=0;
    System.out.print("Enter the Number: ");
    num=sc.nextInt();
    num=Math.abs(num);
    while(num>0){
        r=num%10;
        num/=10;
        result+=r;
    }
    System.out.print("The Sum of the Digits is: "+result);
}
}
