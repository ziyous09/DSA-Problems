package recursion.easy;
import java.util.*;
public class CountZeroes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
//        countZeroes(n);
        System.out.println(countZeroes2(n,0));
    }
    static int zeroes = 0;
    public static void countZeroes(int n){
        if(n==0){
            return;
        }
        if(n%10==0){
            ++zeroes;
        }
        countZeroes(n/10);
    }
    public static int countZeroes2(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return countZeroes2(n/10,c+1);
        }
        return countZeroes2(n/10,c);
    }
}
