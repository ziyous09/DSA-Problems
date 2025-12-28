package recursion.easy;

public class Nto1 {
    public static void main(String[] args){
        number(5);
    }
    static void number(int n){
        if(n == 0){
            return;
        }
        number(n-1);
        System.out.print(n+" ");
    }
}
