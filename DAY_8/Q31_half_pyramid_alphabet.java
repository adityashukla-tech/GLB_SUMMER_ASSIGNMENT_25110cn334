package summer_assignments.DAY_8;
import java.util.*;
public class Q31_half_pyramid_alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            char alphabet='A';
            for(int j=1;j<=i+1;j++){
               System.out.print(alphabet+" ");
               alphabet++;
            }
            System.out.println();
        }
        sc.close();
    }
}
