package mypack;

public abstract class Person {
    protected String name;
    protected int age;
    protected float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }

}