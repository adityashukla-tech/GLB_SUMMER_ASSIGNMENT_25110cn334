package summer_assignments.DAY_8;
import java.util.*;
public class Q30_half_pyramid_numbers {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Pyramid: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
        System.out.println();
        }
        sc.close();
    }
}

