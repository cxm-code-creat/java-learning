package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo8 {
    public static void main(String[]args){

        /*需求：键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在后台*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a=sc.nextInt();
//        1.将其拆分为个位
        int ge=a%10;
//        2.将其拆分为十位
        int shi=a/10%10;
//        3.将其拆分为百位
        int bai=a/100;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);

    }
}
