package ForDemo;

public class ForDemo3 {
    public static void main(String[]args){
        /*需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环
        * 要求：求1-5之间的和*/
//        1.循环的开始条件：1
//        2.循环的结束条件：5
//        3.重复执行的代码：
//        int sum=0;
        for(int i=1;i<=5;i++){
            int sum=0;/*不能写在里面，因为每次循环，都把sum重置成0*/
            sum=i+sum;
            System.out.println(sum);
        }
//        System.out.println(sum);
    }
}
