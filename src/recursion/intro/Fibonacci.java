package recursion.intro;

public class Fibonacci {
    public static void main(String[] args){
        int ans = recursiveFibo(4);
        System.out.println(ans);

    }
    static int recursiveFibo(int n){
        if(n<2){
            return n;
        }
        return recursiveFibo(n-1) + recursiveFibo(n-2);
    }
    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = a+b;
        System.out.print(a+" "+b+" ");
        for(int i = 3; i<n; i++) {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }

    }

}
