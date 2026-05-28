package summer_assignments.DAY_5;
import java.util.*;
public class Q19_factors {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i,num;
        System.out.print("Enter the Number: ");
        num=sc.nextInt();
        if(num==0){System.out.print("Infinite Factors for 0"); sc.close(); return;}
        num=Math.abs(num);
        System.out.print("The Positive Factors are: ");
        for(i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
