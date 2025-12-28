package recursion.strings;
import java.util.*;
public class SubSet {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of arr");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSubSet(arr));
    }
    static List<List<Integer>> findSubSet (int [] arr){
        List<List <Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0;i<n;i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
