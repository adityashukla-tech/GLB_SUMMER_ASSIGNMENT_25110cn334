package summer_assignments.DAY_12;
import java.util.*;
public class Q46_armstrong_function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        if(armstrong(num)){
            System.out.print("Result: The Number is Armstrong ");}
        else{ System.out.print("Result: The Number is NOT Armstrong");}
        sc.close();
    }
    public static boolean armstrong(int n){
        int r,onum=n;
        long d=0,c;
        if(n<0){ return false; }
        onum=Math.abs(onum);
        c=String.valueOf(onum).length();
        while(onum!=0){
            r=onum%10;
            d=d+(int)Math.pow(r,c);
            onum/=10;
        }
        return n==d;
    }
}