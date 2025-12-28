package recursion.easy;
import java.util.*;
public class DigitProduct {
    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        n = sc.nextInt();
        System.out.println(product(n));
    }

    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
