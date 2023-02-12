package Ex1.mypack;

public class Person implements ISpeak, IStudy {
    String name;
    int age;
    float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void speak() {
        System.out.println(this.name + " said " + text);
    }

    public void study() {
        System.out.println(this.name + " is studying");
    }
}
