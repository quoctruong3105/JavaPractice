package mypack;

public class Child extends Parent {
    public Child(int age) {
        super(age);
    }
    public Object clone() {
        Child other = new Child(this.age);
        return other;
    }
}
