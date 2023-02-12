package mypack;

public class Person {
    protected String name;
    protected int age;
    private float height;

    protected Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat(String food) {
        System.out.println(this.name + "is eating" + food);
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected float getHeight() {
        return height;
    }
}