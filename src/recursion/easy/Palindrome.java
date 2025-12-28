package recursion.easy;
import java.util.*;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        int digits = (int)(Math.log10(n))+1;
        int rev = helper(n,digits);
        return rev==n;
    }
    private static int helper(int n , int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

}
