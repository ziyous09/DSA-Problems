package oops;

public class Student {
    private int rollNumber;
    private String name;
    private String section;
    private int marks;

    Student(){
        rollNumber= 0;
        name=null;
        section = "A";
        marks=0;
    }
    Student(int rollNumber, String name, String section, int marks){
        this.rollNumber=rollNumber;
        this.name=name;
        this.section=section;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Section: "+section);
        System.out.println("Marks "+marks);
    }
}
