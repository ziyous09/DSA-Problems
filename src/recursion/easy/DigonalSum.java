package recursion.easy;
import java.util.*;
public class DigonalSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter the element of array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(right(arr,2,0));
    }
    static int right( int [][] arr , int r , int c){
        if(r==0){
            return arr[r][c];
        }
        int sum =0 ;
        sum+= right(arr,r-1,c+1);
        return sum;
    }
}
