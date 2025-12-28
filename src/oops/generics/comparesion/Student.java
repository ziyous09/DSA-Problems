package oops.generics.comparesion;

public class Student implements Comparable<Student>{
    private int rollNo;
    private float marks;

    public Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public float getMarks(){
        return this.marks;
    }

    public static void main(String [ ] args){

    }

    @Override
    public String toString(){
        return marks+" ";
    }
    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}
