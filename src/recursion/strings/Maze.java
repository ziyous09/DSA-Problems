package recursion.strings;
import java.util.*;
public class Maze {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

//        System.out.println(maze(r,c));
        System.out.println(maze2("", r, c));
    }
    static int maze(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
       return maze(r-1,c)+maze(r,c-1);
    }
    static ArrayList<String> maze2(String p , int r , int c){
        if(r==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(maze2(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(maze2(p+"R",r,c-1));
        }
        return list;
    }
}
