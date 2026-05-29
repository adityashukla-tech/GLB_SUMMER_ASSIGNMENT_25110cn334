package summer_assignments.DAY_8;
import java.util.*;
public class Q32_pyramid_repeated_number {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter teh Size: ");
    int num = sc.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    sc.close();
}
}
