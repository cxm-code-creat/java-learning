package IfDemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args){
        /*定义一个变量显示人的体温，对体温进行判断是否大于等于38度，如果超过打印语音警报
       */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入体温：");
        double temperature=sc.nextDouble();
//        判断体温是否大于等于38度
        if(temperature>=38.0){System.out.println("体温异常");}
        if(temperature<38.0){System.out.println("体温正常");}
    }
}
