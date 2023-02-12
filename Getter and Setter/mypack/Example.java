package mypack;

public class Example {
    private int[] arr;
    private Person s;

    public void setArr(int[] arr) {
        this.arr = arr.clone();
    }

    public void setPerson(Person p) {
        this.s = p.clone();
    }

    public Person getPerson() {
        return s.clone();
    }

    public int[] getArr() {
        return this.arr.clone();
    }

    public void disPlayArr() {
        for(int a : this.arr) {
            System.out.println(a);       
        }
        System.out.println();
    }
}
