package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo10 {
    public static void main(String[]args){
//        键盘录入一个三位数，判断是否能被3整除
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个3位数");
        int a=sc.nextInt();
        /*a=a%3;
        boolean result=a==0;
        System.out.println(result);*/

//        1.进行拆分
        int ge=a%10;
        int shi=a/10%10;
        int bai=a/100;
        int sum=ge+shi+bai;
        boolean result=sum%3==0;
        System.out.println(result);
    }


}
