package recursion.easy;

public class concept {
    public static void main(String [] args){
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        //print(--n) will run the loop but print(n--) but it will run infinite loop
        print(--n);

    }
}
