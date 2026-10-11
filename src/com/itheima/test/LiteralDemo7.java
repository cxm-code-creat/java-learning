package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo7 {
    public static void main(String[]args){
        /*计算BMI指数：
        * BMI=体重/身高的平方*/

//        1.找到Scanner打工人
        Scanner sc=new Scanner(System.in);
//        2.定义体重，身高的变量
        System.out.println("请输入体重");
        double weight=sc.nextDouble();
        System.out.println("请输入身高");
        double height=sc.nextDouble();
        System.out.println(weight/(height*height));
    }
}
