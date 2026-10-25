package ithema.opptest3;

public class Teacher {
//    面向对象表示老师
    /* 属性：姓名，年龄
    * 行为：授课，吃饭，睡觉*/

    //    定义属性
    String name;
    int age;
//    行为
//    能干什么？方法的形式体现（不加static）
    public void teach(){
        System.out.println("老师在授课");

    }
    public void eat(){
        System.out.println("老师在吃饭");
    }
    public void sleep() {
        System.out.println("老师在睡觉");
    }

}
