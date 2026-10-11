package com.itheima.test;
import java.util.Scanner;
public class LiterDemo5 {
    public static void main(String[]args){
        /*
        * 键盘录入
        *   第一步:找到Scanner这个打工人
        *   第二步：让Scanner干活*/

//        1.创建Scanner对象
        Scanner sc=new Scanner(System.in);
//        2.让Scanner干活
//        接受键盘录入的整数
       /* int num=sc.nextInt();
        System.out.println(num);*/
//        接受键盘录入的小数
       /* double num=sc.nextDouble();
        System.out.println(num);*/
//        接受键盘录入的字符串
        String str=sc.next();
        System.out.println(str);
    }
}
