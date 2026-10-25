package ithema.opptest5;

public class Dog {
    /*小狗
    * 属性：姓名，年龄
    * 行为：吃骨头
    * 要求1：小狗的年龄：0-15岁
    * 要求2：打印小狗所有信息：小白‘两岁
    * 要求3：两岁的小白，正在吃骨头*/
    private String name;
    private int age;
    public void setName(String value){
        name=value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        if(num<0||num>15){
            System.out.println("年龄范围错误");
        }else{
            age=num;
        }

    }
    public int getAge(){

        return age;
    }
    public void action(){
        System.out.println(age+"岁的"+name+"，正在吃骨头");
    }
}
