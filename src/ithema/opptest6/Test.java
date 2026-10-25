package ithema.opptest6;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        s.action();
        System.out.println("姓名："+s.getName());
        System.out.println("年龄："+s.getAge());
        System.out.println("身高："+s.getHeight());
        System.out.println("体重："+s.getWeight());
//    要求2：大二期间张三体重增加10kg
//  *要求3：大三期间张三减肥成功，身高增加体重减少3kg,身高增加了2cm
   int newWeight=s.getWeight()+10;
   s.setWeight(newWeight);
   s.setAge(s.getAge()+1);
   System.out.println("大二体重变为："+s.getWeight());
   int newHeight=s.getHeight()+2;
   s.setHeight(newHeight);
   s.setAge(s.getAge()+1);
   System.out.println("大三身高变为："+s.getHeight());
   s.setWeight(s.getWeight()-3);
   System.out.println("大三体重变为："+s.getWeight());
   System.out.println(s.getName());
   s.setAge(s.getAge()+2);
   System.out.println("年龄："+s.getAge());
    }
}
