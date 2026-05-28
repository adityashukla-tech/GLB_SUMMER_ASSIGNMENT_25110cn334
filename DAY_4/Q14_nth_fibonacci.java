package summer_assignments.DAY_4;
import java.util.*;
public class Q14_nth_fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,n,first=0,second=1,i;
        System.out.print("Enter the Number you want the Series till: ");
        num=sc.nextInt();
        if(num<=0){
            System.out.print("Enter Positive Number: ");
            sc.close();
            return;
        }
        int[] arr=new int[num];
        System.out.print("Enter the Number you want to find in the Series: ");
        n=sc.nextInt();
        for(i=0;i<num;i++){
            arr[i]=first;
            int next=first+second;
            first=second;
            second=next;
        }
        boolean found=false;
        for(i=0;i<num;i++){
            if(arr[i]==n){
                System.out.println("The Position of the Number "+n+" is: "+(i+1));
                found=true;
            }
        }
        if(!found){System.out.print("None Found");}
        sc.close();
    }
}
