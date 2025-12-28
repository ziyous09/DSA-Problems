package recursion.intro;

public class BinarySearchRecursion {
    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int[10];
//        int target;
//        System.out.println("Enter the elements of array");
//        for(int i = 0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the target");
//        target = sc.nextInt();
        int [] arr = {3,7,9,10,14,17,20};
        int target = 14;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    static int binarySearch(int[] arr,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);
    }
}
