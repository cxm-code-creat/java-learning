package ithema.opptest7;

public class Test {
    public static void main(String[] args){
//        创建对象
        Student s1=new Student();
        s1.setName("张紫妍");
        s1.setAge(18);
        s1.action();
        System.out.println(s1.getName()+s1.getAge());

        Student s2=new Student("崔潇蔓",18);
        s2.action();
        System.out.println(s2.getName()+s2.getAge());

    }
}
