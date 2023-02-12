import javafx.application.Preloader;
import mypack.Example;
import mypack.Person;

public class Hello {
    public static void main(String[] args) {
        
        int[] mang = {1, 2, 3};
        Example e = new Example();
        e.setArr(mang);
        mang[0] = 2;
        e.disPlayArr();

        Person s = new Person("Truong", 22, 1.75f);
        s.setAge(21);
        s.getInfo();
        e.setPerson(s);
        s.setAge(22);
        e.getPerson().getInfo();
        s.getInfo();
    }

}
