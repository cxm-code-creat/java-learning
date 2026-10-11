package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo13 {
    public static void main(String[] args) {
    /*寻找7的有缘数，定义一个两位整数，只要该数字是7或者是7的倍数，就是7的有缘数*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个两位整数：");
        int num=sc.nextInt();
//        1.检验是否为7的倍数或带7的数
        int ge=num%10;
        int shi=num/10%10;
        boolean result=ge==7||shi==7||num%7==0;
        System.out.println(result);
    }
}
