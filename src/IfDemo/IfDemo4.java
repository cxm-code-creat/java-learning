package IfDemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
    /*需求：小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
    * 已知：
    *     饱了吗app：全场9折优惠
    *     美单app：满30减10元
    * 请问：小明买了一顿烧烤50元，在哪家下单更划算*/
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
//        判断哪一家更划算
        double price1=price*0.9;
        double price2;
        if(price>=30) {
             price2 = price - 10;
        }else {
             price2 = price;
        }
        if(price1>price2) {
            System.out.println("美单app更划算");
        }else if(price1<price2) {
            System.out.println("饱了吗app更划算");
        }else {
            System.out.println("两家一样划算");
        }
        }
    }


