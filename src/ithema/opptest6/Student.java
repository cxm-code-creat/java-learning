package ithema.opptest6;

public class Student {
    /*在校学生属性：姓名，年龄，身高，体重
    * 行为：学习
    * 要求1：大一新生，张三，18岁，183cm，60kg，刚进入大学努力学习
    * 要求2：大二期间张三体重增加10kg
     *要求3：大三期间张三减肥成功，身高增加体重减少3kg,身高增加了2cm
    * 要求4：打印大学毕业后，张三所有的信息*/
    private String name;
    private int age;
    private int height;
    private int weight;
    public void setName(String value){
        name=value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age=num;
    }
    public int getAge() {
        return age;
    }
    public void setHeight(int num){
        height=num;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int num){
        weight=num;
    }
    public int getWeight(){
        return weight;
    }
    public void action(){
        System.out.println(name+"正在学习");
    }
}
