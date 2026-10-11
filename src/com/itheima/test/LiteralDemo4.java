package com.itheima.test;

public class LiteralDemo4 {
    public static void main (String[]args){
        /*计算BMI指数
        * BMI数值   身体状况  健康风险
        * <18.5      消瘦    部分增加
        * 18.5-23.9  正常    正常
        * 24.0-26.9  偏胖    增加
        * 27.0-29.9  肥胖    中度增加
        * >=30.0     严重肥胖 严重增加
        *
        * BMI的计算公式：BMI=体重/身高的平方 */

//        1.定义变量记录体重和身高
        double weight=76;
        double height=1.64;
//        2.计算BMI指数
        double BMI=weight/(height*height);
        System.out.println(BMI);
//        3.计算出当前在自己的身高下最适合的体重范围
        BMI=18.5;
        weight=BMI*(height*height);
        System.out.println(weight);


    }
}
