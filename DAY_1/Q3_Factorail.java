package summer_assignments.DAY_1;
import java.util.*;
public class Q3_Factorail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,num,ans=1;
        System.out.print("Enter the Number= ");
        num=sc.nextInt();
        for(i=num;i>0;i--){
            ans=ans*i;
            System.out.print(i);
            if(i>1){
                System.out.print(" x ");
            }
        }
        System.out.println(" = "+ans);
    }
}
