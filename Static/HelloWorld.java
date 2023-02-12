import mypack.Student;

public class HelloWorld {
    static String course;
    static float version;
    static {
        course = "Java";
        version = 1.5f;
        System.out.println(course + " " + version);
    }
    public static void main(String[] args) {
        Student a = new Student("Truong", 22, 1.75f);
        System.out.println("University: " + Student.universityName);
        System.out.println(Student.total);
        Student b = new Student("Trung", 22, 1.85f);
        System.out.println(Student.total);
        Student.getUniversityNameInfo();
    }
}