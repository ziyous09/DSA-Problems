package recursion.intro;

public class Numbers {
    public static void main(String [] args){
        printNum(5);
    }
//    static void printNum(int n){
//        System.out.println(n);
//        printNum1(4);
//    }
//    static void printNum1(int n){
//        System.out.println(n);
//        printNum2(3);
//    }
//    static void printNum2(int n){
//        System.out.println(n);
//        printNum3(2);
//    }
//    static void printNum3(int n){
//        System.out.println(n);
//        printNum4(1);
//    }
//    static void printNum4(int n){
//        System.out.println(n);
//    }
    static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

}
