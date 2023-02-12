package mypack;

public class Student {
    public String name;
    public int age;
    float height;
    
    public static String universityName = "HCMUTE";
    public static int total = 0;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }
    public static void getUniversityNameInfo() {
        System.out.println(universityName);
    }
}
