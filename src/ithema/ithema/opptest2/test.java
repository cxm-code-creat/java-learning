package ithema.ithema.opptest2;

public class test {
    public static void main(String[] args){
//        创建对象记录第一个学生的属性
        Student s1=new Student();
//        给对象的属性赋值
        s1.name="张三";
        s1.gender="男";
        s1.age=18;
        s1.height=1.75;
//        获取第一个学生的属性
        System.out.println(s1.name);
        System.out.println(s1.gender );
        System.out.println(s1.age );
        System.out.println(s1.height);
    }
}
