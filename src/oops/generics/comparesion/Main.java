package oops.generics.comparesion;
import java.util.*;
public class Main {
    public static void main(String [] args){
        Student kunal = new Student(9,19.00f);
        Student brijesh = new Student(8,66.34f);
        Student rahul = new Student(6,45.99f);
        Student deepak = new Student(2,66.44f);
        Student aman = new Student(2,90.66f);

        Student[] list = {kunal,brijesh,rahul,deepak,aman};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.getMarks()-o1.getMarks());
            }
        });
        System.out.println(Arrays.toString(list));
//        if(kunal.compareTo(brijesh)>0){
//            System.out.println("Kunal have more marks then brjesh");
//        }
//        else{
//            System.out.println("Brijesh have more marks then kunal");
//        }

    }
}
