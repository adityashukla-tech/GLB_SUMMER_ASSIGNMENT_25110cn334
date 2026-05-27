package summer_assignments;
import java.util.*;
public class Q7_product_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,i,pro=1;
        System.out.print("Enter the Number: ");
        num=sc.nextInt();
        if(num==0){
            System.out.print("Product= "+0);
            sc.close();
            return;
        }
        num=Math.abs(num);
        while(num>0){
            i=num%10;
            pro=pro*i;
            num/=10;
        }
        System.out.print("Product Number is : "+pro);
        sc.close();
    }
}
