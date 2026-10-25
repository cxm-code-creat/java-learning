package ithema.itheima.opptest1;

public class test {
    public static void main(String[] args){
//        创建对象，记录第一只小狗的信息
        Dog dog1=new Dog();
//        给对象的属性赋值
        dog1.name="旺财";
        dog1.age=1;
        dog1.weight=10;
        dog1.color="黄色";
//        获取第一只小狗的信息
        System.out.println(dog1.name);
        System.out.println(dog1.age );
        System.out.println(dog1.weight);
        System.out.println(dog1.color);


//        创建第二个对象，记录第二只小狗的信息
        Dog dog2=new Dog();
        dog2.name="小白";
        dog2.age=2;
        dog2.weight=4.5;
        dog2.color="白色";
//        获取第二只小狗的信息
        System.out.println(dog2.name);
        System.out.println(dog2.age );
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
    }
}
