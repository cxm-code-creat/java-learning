package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo12 {
    public static void main(String[] args) {
    /*键盘录入一个四位数，判断这个数字是否为回文数*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num=sc.nextInt();
//        1.判断是否为回文数
        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100%10;
        int qian=num/1000;
        boolean result=ge==qian&&shi==bai;
        System.out.println(result);
    }
}
