package IfDemo;

import java.util.Scanner;

public class IfDemo7 {
    public static void main(String[] args) {
        /*充值金额      赠送金额
         * 1000          200
         * 2000          500
         * 3000          700
         * 5000          1300
         * 10000         2500
         * 20000         6000
         * 50000         15000*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额");
        int money = sc.nextInt();
        int price = 0;
//        赠送金额
        if (money > 0) {
            if (money < 1000) price = 0;
            else if (money < 2000) price = 200;
            else if (money < 3000) price = 700;
            else if (money < 5000) price = 1300;
            else if (money < 10000) price = 2500;
            else if (money < 20000) price = 6000;
            else if (money < 50000) price = 15000;
            System.out.println("总金额为："+(price+money));
        }else{
                System.out.println("金额错误");
            }
        }
    }

