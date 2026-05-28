package summer_assignments.DAY_5;
import java.util.*;
public class Q17_Perfect_number {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num,i,sum=0;
    System.out.print("Enter the Number: ");
    num= sc.nextInt();
    num=Math.abs(num);
    if (num<=1) {
        System.out.print("Entered Number is NOT Perfect Number");
        sc.close();
        return;
    }
    for(i=1;i<=num/2;i++){
        if(num%i==0){
            sum+=i;
        }
    }
    if(sum==num){
        System.out.print("Entered Number is Perfect Number");
    }
    else{System.out.print("Entered Number is NOT Perfect Number");}
    sc.close();
}
}
