package Ex2.mypack;

public abstract class Person implements ISpeak, Istudy {
    String name;
    int age;
    float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}