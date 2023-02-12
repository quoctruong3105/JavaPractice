package mypack;

public abstract class Parent {
    protected int age;

    public Parent(int age) {
        this.age = age;
    }
    public abstract Object clone();
}