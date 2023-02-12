import mypack.Person;

public class HelloWorld extends Person  {  
    protected HelloWorld(String name, int age, float height) {
        super(name, age, height);
    }
    public static void main(String[] args) {
        HelloWorld s = new HelloWorld("Truong", 22, 1.75f);
        s.eat("meat");
        System.out.println(s.getAge());
    }
} 