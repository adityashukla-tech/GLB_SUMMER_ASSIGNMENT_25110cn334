package summer_assignments.DAY_14;
import java.util.*;
public class Q53_linear_search {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Element: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Number you want to search: ");
        int sch=sc.nextInt();
        int flag=0;
        for(int i=0;i<size;i++) {
            if (arr[i] == sch) {
                flag = 1;
                System.out.print(i + " ");
            }
        }
            System.out.println();
        if(flag==0){ System.out.print("No Searched Number Exist");}
        sc.close();
    }
}
