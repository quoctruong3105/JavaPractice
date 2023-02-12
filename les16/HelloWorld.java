public class HelloWorld {
    public static void main(String[] args) {
        Person[] s = new Person[3];
        s[0] = new Person();
        s[0].name = "truong";
        s[0].age = 20;
        s[0].height = 1.73f;
        s[1] = new Person();
        s[1].name = "huy";
        s[1].age = 20;
        s[1].height = 1.7f;
        s[2] = new Person();
        s[2].name = "duy";
        s[2].age = 20;
        s[2].height = 1.65f;
        System.out.println(s[1].name);
        System.out.print(s[1].name);
        System.out.println(s[2].name);
    }
}