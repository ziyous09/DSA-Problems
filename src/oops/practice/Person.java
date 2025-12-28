package oops;

public class Person {
    private String name;
    private Country country;

    public Person(String name, Country country) {
        this.name = name;
        this.country = country;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Country: "+country);
    }
}
