package mypack;

import javax.rmi.CORBA.StubDelegate;

public class Student extends Person {
    
    private String university = "HCMUTE";

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

    public final void showInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
        System.out.println(this.university);
    }
}
