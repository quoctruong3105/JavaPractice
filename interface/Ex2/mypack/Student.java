package Ex2.mypack;

public class Student extends Person {
    Student(String name, int age, float height) {
        super(name, age, height);
    }
    
    public void study() {
        System.out.println(this.name + " is studying");
    }

    public void speak() {
        System.out.println(this.name + " said " + text);
    }
}