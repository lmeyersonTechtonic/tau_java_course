package chapter9;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("In the Person Constructor");
    }

    public Person(String name) {
        System.out.println("In the 2nd Person Constructor. Name is set.");
//        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
