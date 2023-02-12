package mypackage;
public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    public Person(String name, int age, float height) {
        this(name, age);
        this.height = height;
    }
}