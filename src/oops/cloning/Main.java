package oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws CloneNotSupportedException {
        Human kunal = new Human(19,"kunal");
//        Human karan = new Human(kunal);
        Human twins = (Human)kunal.clone();
//        System.out.println(kunal.getAge()+" "+kunal.getName());
//        System.out.println(karan.getAge()+" "+karan.getName());
        twins.nums[0]=100;
        System.out.println(Arrays.toString(twins.nums));
        System.out.println(Arrays.toString(kunal.nums));
        // Example of cello copy;
        // all primitiv data type will be created but not primitive will get pointed;
        System.out.println(twins.getAge()+" "+twins.getName());
    }
}
