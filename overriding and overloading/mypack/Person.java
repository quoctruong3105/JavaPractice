package mypack;

public class Person {
    private String name;
    private int age;
    private float height;

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

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public void getInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("height: " + this.height);
    }
}
