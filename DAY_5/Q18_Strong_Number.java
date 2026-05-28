package summer_assignments.DAY_5;
import java.util.*;
public class Q18_Strong_Number {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int i,num,r,d=0,onum;
      System.out.print("Enter the Number:  ");
      num=sc.nextInt();
      onum=Math.abs(num);
      if(onum<=0){System.out.print("Entered Number is NOT Strong Number"); sc.close(); return;}
      while(onum>0){
          r=onum%10;
          int result=1;
          for(i=1;i<=r;i++){
              result=result*i;
          }
          d+=result;
          onum/=10;
      }
      if(d==Math.abs(num)){System.out.print("Entered Number is Strong number");
      }
      else{System.out.print("Entered Number is NOT Strong Number");}
      sc.close();
    }
}
