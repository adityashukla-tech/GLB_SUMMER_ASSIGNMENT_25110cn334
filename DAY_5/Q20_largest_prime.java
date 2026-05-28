package summer_assignments.DAY_5;
import java.util.*;
public class Q20_largest_prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num,maxp=-1,i;
        System.out.print("enter the Number: ");
        num=sc.nextLong();
        if (num <= 1) {
            System.out.println("No prime factors");
            sc.close();
            return;
        }
        while(num%2==0){ maxp=2; num/=2;}
        for(i=3;i*i<=num;i+=2){
            while(num%i==0){ maxp=i; num/=i;}}
        if(num>2){ maxp=num;}
        System.out.println("Largest Number prime Factor: "+maxp);
        sc.close();
    }
}

