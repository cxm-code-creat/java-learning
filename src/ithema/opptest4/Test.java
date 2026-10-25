package ithema.opptest4;

public class Test {
    public static void main(String[] args){
//        创建对象记录厨师信息
        Cook c=new Cook();
        c.name="张资源";
        c.age=30;
        c.skill="专业";
        System.out.println(c.name);
        System.out.println(c.age );
        System.out.println(c.skill );
//        调用方法
        c.action();
    }
}
