package mypack;

import javafx.application.Preloader;

public class Person {
    private String name;
    private int age;
    private float height;

    public Person(String name, int age, float height) {
        this.name =  name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            System.out.println("age is not compatible!");
        } else {
            this.age = age;
        }
    }

    public Person clone() {
        Person newPerson = new Person(this.name, this.age, this.height);
        return newPerson;
    }

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }
}