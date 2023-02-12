import mypack.Student;
import mypack.Person;
import mypack.Parent;
import mypack.Child;

public class Hello {
    public static void main(String[] args) {
        //Person p = new Person("Truong", 22, 1.75f);
        Student  s = new Student("Truong", 22, 1.75f);
        s.showInfo();
    }
}

