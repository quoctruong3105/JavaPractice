package mypack;

public class Student extends Person{
    private String universityName = "HCMUTE";
    public Student(String name, int age, float height, String university) {
        super(name, age, height);
        this.universityName =  university;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("university: " + universityName);
    }
}
