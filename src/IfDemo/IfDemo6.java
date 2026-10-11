package IfDemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        /*需求：很多APP都有不同的优惠券
         * 假设，现在有以下优惠券
         *      全场商品满10减8
         *      全场商品满50减30
         *      全场商品满100减50
         *      全场商品满200减90
         *
         *      会员卡，全场8折
         *   请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？ */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        double price = sc.nextDouble();
//定义变量，表示优惠过后的价格
        double price1 = 0;
        if (price > 0) {
            if (price < 10) {
                price1 = price;
            } else if (price < 50) {
                price1 = price - 8;
            } else if (price < 100) {
                price1 = price - 50;
            } else if (price < 200) {
                price1 = price - 90;
            } else {
                price1 = price - 90;
            }
            }else{
                System.out.println("价格错误");
            }
            double price2 = price * 0.8;
            if (price1 < price2) {
                System.out.println("用优惠券" + price1);
            } else {
                System.out.println("用会员卡" + price2);
            }
        }
    }


