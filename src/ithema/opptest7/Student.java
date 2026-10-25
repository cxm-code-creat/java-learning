package ithema.opptest7;

public class Student {
    /*定义一个javabean类描述学生：
    * 属性：姓名，年龄
    * 行为：学习，吃饭，睡觉*/
//    定义属性
    private String name;
    private int age;
//    构造方法
//    alt+insert

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    定义set和get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    定义行为方法
    public void action(){
        System.out.println(name+"正在学习"+"等会去吃饭"+"晚上睡觉");
    }
}
