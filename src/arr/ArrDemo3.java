package arr;

import java.util.Scanner;

public class ArrDemo3 {
    public static void main(String[] args) {
        /*需求：已知数组元素为{33,5,22,44,55,33}
        * 键盘录入任意一个，查找这个数据在数组中是否存在
        * 如果数组中要查找的数据出现多次，只要显示第一次的索引即可
        * 输出要求:
        *        如果存在打印索引
        *        如果不存在，提示"该数据不存在"*/
        int arr[]={33,5,22,44,55,33};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int num=sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(arr[i]);
                count++;
                break;
            }
        }
            if(count==0){
            System.out.println("该数据不存在");
        }
    }
}
