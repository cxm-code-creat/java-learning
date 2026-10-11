package com.itheima.test;

import java.util.Scanner;

public class LiteralDemo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*描述：给定秒数seconds，将其转换为对应的小时数，分钟数和秒数，使得总时间不变，
        * 但分钟数和秒数都不超过59*/
        System.out.println("请输入秒数");
        int seconds=sc.nextInt();
        int h=seconds/3600;
        int m=seconds%3600/60;
        int s=seconds%3600%60;
        System.out.println(h+"小时");
        System.out.println(m+"分");
        System.out.println(s+"秒");
        System.out.println(h+"小时"+m+"分"+s+"秒");

    }
}
