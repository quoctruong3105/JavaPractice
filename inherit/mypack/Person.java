package mypack;

public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("height: " +  this.height);
    }
}