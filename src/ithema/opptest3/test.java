package ithema.opptest3;

public class test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="张珊";
        t.age=39;
        System.out.println(t.name);
        System.out.println(t.age);
//        调用行为
        t.teach();
        t.eat();
        t.sleep();
    }
}
