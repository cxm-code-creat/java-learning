package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo11 {
    public static void main(String[] args) {
        /*键盘录入一个整数，判断这个数字是否在1~10之间*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int shu=sc.nextInt();
        boolean result=shu>1&shu<10;
        System.out.println(result);
    }
}
