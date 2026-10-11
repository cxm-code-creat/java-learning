package com.itheima.test;

public class LiteralDemo2 {
    public static void main(String[] args) {
        /*微信余额；0元
        * 支付宝余额；10元
        * 银行卡余额；20元
        * 问题一；请问现在一共有多少钱?
        * 问题2；微信收了10元红包，又发了2元红包，余额多少？*/
//       1.定义一个变量记录微信余额
        double a=0;
//       2.定义一个变量记录支付宝余额
        double b=10;
//       3.定义一个变量记录银行卡余额
        double c=20;
//       4.求现在一共有多少元
        System .out.println(a+b+c);
//       5.微信收了10元红包
//       原来的余额+10元红包=新的余额
//       让变量a记录新的余额
         a=a+10;
//        执行过程；
//        1.计算a+10，此时变量a里面记录的为0,10+0=10
//        2.再把10赋值给变量a原本记录的值，就被覆盖了
         a=a-2;
        System.out.println(a);


    }
}
