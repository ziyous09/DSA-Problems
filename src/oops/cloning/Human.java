package oops.cloning;

public class Human implements Cloneable{
    private int age;
    private String name;
    public int [] nums;


    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.nums = new int [] {1,2,3,4,5};
    }
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
