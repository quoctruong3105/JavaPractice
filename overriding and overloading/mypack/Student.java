package mypack;

public class Student extends Person {
    private String university = "UTE";

    public Student(String name, int age, float height, String university) {
        super(name, age, height);
        this.university = university;
    }

    // public void getInfo() {
    //     super.getInfo();
    //     System.out.println("university: " + university);
    // }

    public final void getInfo() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getHeight());
        System.out.println(university);
    }
}