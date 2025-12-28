package recursion.intro;

public class Message {
    public static void main(String[]args){
        message1();
    }
    static void message1(){
        System.out.println("This is message");
        message2();
    }
    static void message2(){
        System.out.println("This is message");
        message3();
    }
    static void message3(){
        System.out.println("This is message");
        message4();
    }
    static void message4(){
        System.out.println("This is message");
        message5();
    }
    static void message5(){
        System.out.println("This is message");
    }
}
