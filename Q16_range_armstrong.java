package summer_assignments;
import java.util.*;
public class Q16_range_armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,i,num2,onum,r,len;
        System.out.print("Enter the Number to start from: ");
        num1=sc.nextInt();
        System.out.print("Enter the Number you like to End with: ");
        num2=sc.nextInt();
        num1=Math.abs(num1);
        num2=Math.abs(num2);
        boolean found=false;
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        for(i=num1;i<=num2;i++){
           onum=i;
           int d=0;
           len=String.valueOf(i).length();
           if(i==0){
               System.out.print(0+" ");
               found=true;
               continue;
           }
            while (onum > 0) {
                r=onum%10;
                d+=(int)Math.pow(r,len);
                onum/=10;
            }
            if(d==i){
                System.out.print(d+" ");
                found=true;
            }
        }
        if (!found){System.out.print("None Found");}
        sc.close();
    }
}
