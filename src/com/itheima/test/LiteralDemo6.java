package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo6 {
    public static void main(String[] args) {
    /*定义两个整数类型的变量mun1和mun2，键盘录入数据分别为两个变量赋值，
    * 求两个数的和并进行打印*/

//        1.找到scanner这个打工人
        Scanner sc=new Scanner(System.in);
//        2.定义两个整数类型mun1和mun2
        int mun1,mun2;
        mun1=sc.nextInt();
        mun2=sc.nextInt();
     /* System.out.println(mun1);
        System.out.println(mun2);*/
//        3.计算两个整数的和
        System.out.println(mun1+mun2);
    }
}
